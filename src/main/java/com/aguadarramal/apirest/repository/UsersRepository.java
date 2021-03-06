package com.aguadarramal.apirest.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aguadarramal.apirest.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users,Integer>{

	@Transactional(readOnly = true)
	Optional<Users> findByUsername(String username);
	
	
}
