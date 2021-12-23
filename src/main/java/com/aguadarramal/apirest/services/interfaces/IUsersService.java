package com.aguadarramal.apirest.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aguadarramal.apirest.dto.UsersDTO;

@Service
public interface IUsersService {

	Page<UsersDTO> findAll();
	Optional<UsersDTO> findByUsername(String username);
	Optional<UsersDTO> findById(int userId);
	void save(UsersDTO user);
	void saveAll(List<UsersDTO>users);
	void deleteById(int userId);
}
