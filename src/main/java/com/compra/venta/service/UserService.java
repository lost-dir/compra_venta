package com.compra.venta.service;

import java.util.List;

import com.compra.venta.bean.UserBean;

public interface UserService {
	//save an user
	public boolean saveUser(UserBean userBean);
	
	//update an existing user
	public String updateUser(UserBean userBean);
	
	//get an unique user by e-mail
	public UserBean getUser(String mail);
	
	//get all users from user's table
	public List<UserBean> getUsers();
	
	//erase an existing user
	public boolean deleteUser(String mail);
}
