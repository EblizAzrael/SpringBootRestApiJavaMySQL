package com.aguadarramal.apirest.validator;

import org.springframework.stereotype.Service;

import com.aguadarramal.apirest.dto.UserRequest;
import com.aguadarramal.apirest.utils.exceptions.ApiUnprocessableEntity;

/*
 * Interface para la validacion de los datos recibidos para la creacion de usuarios
 * */

@Service
public interface IUserValidator {

	void validator(UserRequest request) throws ApiUnprocessableEntity;
	
}
