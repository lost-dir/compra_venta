package com.compra.venta.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	//***RELACIÓN DE UNO A UNO***
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idInfo")
	private InfoUser infoUser;
	//***FIN DE LA RELACIÓN***
	
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
	//GETTER & SETTER DE LA ENTIDAD RELACIONADA ARRIBA

	public InfoUser getInfoUser() {
		return infoUser;
	}

	public void setInfoUser(InfoUser infoUser) {
		this.infoUser = infoUser;
	}
}
