package com.aguadarramal.apirest.dto;

import java.io.Serializable;
import java.util.Date;

public class UsersDTO implements Serializable {

	private String id;
	private String firstname;
	private String lastname;
	private String username;
	private Date createdAT;
	private Date updatedAT;
	
	

	public UsersDTO() {
	}

	public UsersDTO(String id, String firstname, String lastname, String username, Date createdAT, Date updatedAT) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.createdAT = createdAT;
		this.updatedAT = updatedAT;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}
	public Date getUpdatedAT() {
		return updatedAT;
	}
	public void setUpdatedAT(Date updatedAT) {
		this.updatedAT = updatedAT;
	}

	
}
