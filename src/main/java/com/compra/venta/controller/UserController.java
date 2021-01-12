package com.compra.venta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compra.venta.bean.UserBean;
import com.compra.venta.service.impl.UserServiceImplement;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImplement userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<Boolean> saveUser(@Valid @RequestBody UserBean userBean){
		return new ResponseEntity<Boolean>(this.userService.saveUser(userBean), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUser(@Valid @RequestBody UserBean userBean){
		return new ResponseEntity<String>(this.userService.updateUser(userBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getUser/{mail}")
	public ResponseEntity<UserBean> getUser(@PathVariable("mail") String mail){
		return new ResponseEntity<UserBean>(this.userService.getUser(mail), HttpStatus.FOUND);
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UserBean>> getUsers(){
		return new ResponseEntity<List<UserBean>>(this.userService.getUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteUser/{mail}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("mail") String mail){
		return new ResponseEntity<Boolean>(this.userService.deleteUser(mail), HttpStatus.OK);
	}
}
