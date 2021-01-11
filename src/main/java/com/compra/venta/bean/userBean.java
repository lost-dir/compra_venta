package com.compra.venta.bean;

import java.io.Serializable;

//import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class userBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@Size(max = 100)
	private String mail;
	
	@NotNull
	@Size(max = 50)
	private String userName;
	
	@NotNull
	@Size(max = 100)
	private String passUser;

	public userBean() {
	}

	public userBean(@NotNull @Size(max = 100) String mail, @NotNull @Size(max = 50) String userName,
			@NotNull @Size(max = 100) String passUser) {
		this.mail = mail;
		this.userName = userName;
		this.passUser = passUser;
	}

	public String getMail() {
		return mail;
	}

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
