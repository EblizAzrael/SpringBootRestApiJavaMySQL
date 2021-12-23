package com.aguadarramal.apirest.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.aguadarramal.apirest.dto.UsersDTO;
import com.aguadarramal.apirest.entities.Users;
import com.aguadarramal.apirest.repository.UsersRepository;
import com.aguadarramal.apirest.services.interfaces.IUsersService;
import com.aguadarramal.apirest.utils.Mhelpers;

@Component
public class UsersImpl implements IUsersService{
	
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public Page<UsersDTO> findAll() {
		
		Page<Users> users = this.usersRepository.findAll();
		return users.map(this::convertToUsersDTO) ;
	}

	@Override
	public UsersDTO findByUsername(String username) {
		Optional<Users> users = this.usersRepository.findByUsername(username);
		if(!users.isPresent()) {
			return null;
		}
		return Mhelpers.modelMapper().map(users.get(), UsersDTO.class);
	}

	@Override
	public UsersDTO findById(int userId) {
		Optional<Users> users = this.usersRepository.findById(userId);
		if(!users.isPresent()) {
			return null;
		}
		return Mhelpers.modelMapper().map(users.get(), UsersDTO.class);
	}
	

	@Override
	public void save(UsersDTO user) {
		Users users = Mhelpers.modelMapper().map(user, Users.class);
		this.usersRepository.save(users);
		
	}

	@Override
	public void saveAll(List<UsersDTO> users) {

		List<Users> u = new ArrayList<>();
		for(UsersDTO user : users) {
			Users us = Mhelpers.modelMapper().map(users,  Users.class);
			u.add(us);
		}
		this.usersRepository.saveAll(u);
	}

	@Override
	public void deleteById(int userId) {
		this.usersRepository.deleteById(userId);
		
	}
	
	private UsersDTO convertToUsersDTO(final Users user) {
		return Mhelpers.modelMapper().map(user, UsersDTO.class);
	}



	

}
