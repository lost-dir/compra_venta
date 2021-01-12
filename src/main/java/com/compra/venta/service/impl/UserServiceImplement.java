package com.compra.venta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compra.venta.bean.UserBean;
import com.compra.venta.model.User;
import com.compra.venta.repository.UserRepository;
import com.compra.venta.service.UserService;

@Service
@Transactional
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean saveUser(UserBean userBean) {
		User user = new User();
		user.setMail(userBean.getMail());
		user.setUserName(userBean.getUserName());
		user.setPassUser(userBean.getPassUser());
		this.userRepo.save(user);
		return true;
	}

	@Override
	public String updateUser(UserBean userBean) {
		User user = this.userRepo.findById(userBean.getMail()).orElseThrow();
		user.setMail(userBean.getMail());
		user.setUserName(userBean.getUserName());
		user.setPassUser(userBean.getPassUser());
		return user.getMail();
	}

	@Override
	public UserBean getUser(String mail) {
		User user = this.userRepo.findById(mail).orElseThrow();
		UserBean userBean = new UserBean();
		userBean.setMail(user.getMail());
		userBean.setUserName(user.getUserName());
		userBean.setPassUser(user.getPassUser());
		userBean.setInfoUser(user.getInfoUser());
		return userBean;
	}

	@Override
	public List<UserBean> getUsers() {
		List<User> userList = this.userRepo.findAll();
		List<UserBean> userBeanList = new ArrayList<>();
		for(int i = 0; i < userList.size(); i++) {
			UserBean userBean = new UserBean();
			userBean.setMail(userList.get(i).getMail());
			userBean.setUserName(userList.get(i).getUserName());
			userBean.setPassUser(userList.get(i).getPassUser());
			userBean.setInfoUser(userList.get(i).getInfoUser());
			userBeanList.add(userBean);
		}
		return userBeanList;
	}

	@Override
	public boolean deleteUser(String mail) {
		User user = this.userRepo.findById(mail).orElseThrow();
		this.userRepo.delete(user);
		return true;
	}

}
