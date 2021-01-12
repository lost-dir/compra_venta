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

import com.compra.venta.bean.InfoUserBean;
import com.compra.venta.service.impl.InfoUserServiceImpl;

@RestController
@RequestMapping("/infoUser")
public class InfoUserController {
	
	@Autowired
	private InfoUserServiceImpl infoUserService;
	
	@PostMapping("/saveInfo")
	public ResponseEntity<Integer> saveUser(@Valid @RequestBody InfoUserBean infoUserBean){
		return new ResponseEntity<Integer>(this.infoUserService.saveInfo(infoUserBean), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateInfo")
	public ResponseEntity<Boolean> updateUser(@Valid @RequestBody InfoUserBean infoUserBean){
		return new ResponseEntity<Boolean>(this.infoUserService.updateInfo(infoUserBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getInfo/{idInfo}")
	public ResponseEntity<InfoUserBean> getUser(@PathVariable("idInfo") int idIinfo){
		return new ResponseEntity<InfoUserBean>(this.infoUserService.getInfo(idIinfo), HttpStatus.FOUND);
	}
	
	@GetMapping("/getInfoUsers")
	public ResponseEntity<List<InfoUserBean>> getInfoUsers(){
		return new ResponseEntity<List<InfoUserBean>>(this.infoUserService.getInfoUsers(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteInfo/{idInfo}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("idInfo") int idInfo){
		return new ResponseEntity<Boolean>(this.infoUserService.deletInfo(idInfo), HttpStatus.OK);
	}
}
