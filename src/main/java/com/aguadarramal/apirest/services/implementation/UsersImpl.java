package com.aguadarramal.apirest.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.aguadarramal.apirest.dto.UsersDTO;
import com.aguadarramal.apirest.entities.Users;
import com.aguadarramal.apirest.repository.UsersRepository;
import com.aguadarramal.apirest.services.interfaces.IUsersService;

@Component
public class UsersImpl implements IUsersService{
	
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public Page<UsersDTO> findAll() {
		
		Page<Users> users = this.usersRepository.findAll();
		return null;
	}

	@Override
	public Optional<UsersDTO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsersDTO> findById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UsersDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<UsersDTO> users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		
	}

}
