package com.aguadarramal.apirest.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable{

	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at")
	private Date updatedAt;

	@PrePersist //Previo al momento de la creacion la marca de fecha
	public void prePersist() {
		this.createdAt = new Date();
		}
	
	@PreUpdate //Previo al momento de la actualizacion la marca de fecha
	public void preUpdate() {
		this.updatedAt = new Date();
		}
	}
