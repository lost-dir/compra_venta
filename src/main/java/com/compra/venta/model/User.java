package com.compra.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mail", nullable = false, length = 100)
	private String mail;
	
	@Column(name = "user_name", nullable  = false, length = 50)
	private String userName;
	
	@Column(name = "pass_user", nullable = false, length = 100)
	private String passUser;
	
	//CONSTRUCTORS
	public User() {
	}

	public User(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}
	
	//GETTERS & SETTERS
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassUser() {
		return passUser;
	}

	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}
}
