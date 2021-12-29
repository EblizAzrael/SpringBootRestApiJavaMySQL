package com.aguadarramal.apirest.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aguadarramal.apirest.dto.UserRequest;
import com.aguadarramal.apirest.dto.UsersDTO;

@Service
public interface IUsersService {

	List<UsersDTO> findAll();
	UsersDTO findByUsername(String username);
	UsersDTO findById(int userId);
	void save(UserRequest user);
	void saveAll(List<UserRequest>users);
	void update(UserRequest userRequest, int id);
	void deleteById(int userId);
}
