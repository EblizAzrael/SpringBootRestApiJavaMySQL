package com.aguadarramal.apirest.validator;

import org.springframework.stereotype.Component;

import com.aguadarramal.apirest.dto.UserRequest;
import com.aguadarramal.apirest.utils.exceptions.ApiUnprocessableEntity;

@Component
public class UserValidatorImpl implements IUserValidator {

	@Override
	public void validator(UserRequest request) throws ApiUnprocessableEntity {
		if (request.getFirstname() == null || request.getFirstname().isEmpty()) {
			message("El nombre es obligatorio");
		}
		if (request.getFirstname().length()<3) {
			message("El nombre debe tener al menos 3 caracteres");
		}
		if (request.getLastname() == null || request.getLastname().isEmpty()) {
			message("El Apellido es obligatorio");
		}
		if (request.getLastname().length()<3) {
			message("El Apellido debe tener al menos 3 caracteres");
		}
		if (request.getUsername() == null || request.getUsername().isEmpty()) {
			message("El Usuario es obligatorio");
		}
		if (request.getUsername().length()<6) {
			message("El Usuario debe tener al menos 6 caracteres");
		}
		if (request.getPassword() == null || request.getPassword().isEmpty()) {
			message("La contraseña es obligatoria");
		}
		if (request.getPassword().length()<6) {
			message("\"La contraseña debe tener al menos 6 caracteres");
		}
		
		
	}

	private void message(String message) throws ApiUnprocessableEntity{
		throw new ApiUnprocessableEntity(message);
	}
}
