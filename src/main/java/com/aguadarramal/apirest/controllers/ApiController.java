package com.aguadarramal.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguadarramal.apirest.dto.UserRequest;
import com.aguadarramal.apirest.services.interfaces.IUsersService;
import com.aguadarramal.apirest.utils.exceptions.ApiUnprocessableEntity;
import com.aguadarramal.apirest.validator.IUserValidator;


@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class ApiController {
 
	@Autowired
	private IUsersService userservice;
	@Autowired
	private IUserValidator userValidator;
	
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok(this.userservice.findAll());
    }
    
    @GetMapping(value="/findByUsername/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByUserName(@PathVariable("username") String username){
    	return ResponseEntity.ok(this.userservice.findByUsername(username));
    } 
    
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUser(@RequestBody UserRequest userRequest) throws ApiUnprocessableEntity{
    	this.userValidator.validator(userRequest);
    	this.userservice.save(userRequest);
		return ResponseEntity.ok(Boolean.TRUE);    	
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
    	this.userservice.deleteById(id);
    	return ResponseEntity.ok(Boolean.TRUE);
    }
    
    @PutMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Object> update(@PathVariable int id, @RequestBody UserRequest userRequest) throws ApiUnprocessableEntity {    	
    	this.userservice.update(userRequest, id);
    	return ResponseEntity.ok(Boolean.TRUE);
	
}
}
