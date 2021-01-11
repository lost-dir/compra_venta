package com.compra.venta.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idInfo;
	
	@NotNull
	@Size(max = 50)
	private String firstName;
	
	@NotNull
	@Size(max = 50)
	private String lastName;
	
	@NotNull
	@Size(max = 100)
	private String userAddr;

	//CONSTRUCTORES
	public InfoUserBean() {
		
	}
	public InfoUserBean(int idInfo) {
		this.idInfo = idInfo;
	}
	
	//GETTERS & SETTERS
	public int getIdInfo() {
		return idInfo;
	}
	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
}
