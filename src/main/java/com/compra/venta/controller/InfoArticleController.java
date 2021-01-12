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

import com.compra.venta.bean.InfoArticleBean;
import com.compra.venta.service.impl.InfoArticleServiceImpl;

@RestController
@RequestMapping("/infoArticle")
public class InfoArticleController {

		@Autowired
		private InfoArticleServiceImpl infoArticleService; 
		
		@PostMapping("/saveInfo")
		public ResponseEntity<Integer> saveInfo(@Valid @RequestBody InfoArticleBean infoArticleBean){
			return new ResponseEntity<Integer>(this.infoArticleService.saveInfo(infoArticleBean), HttpStatus.CREATED);
		}
		
		@PutMapping("/updateUser")
		public ResponseEntity<Boolean> updateInfo(@Valid @RequestBody InfoArticleBean infoArticleBean){
			return new ResponseEntity<Boolean>(this.infoArticleService.updateInfo(infoArticleBean), HttpStatus.ACCEPTED);
		}
		
		@GetMapping("getInfo/{idInfo}")
		public ResponseEntity<InfoArticleBean> getInfo(@PathVariable("idInfo") int idInfo){
			return new ResponseEntity<InfoArticleBean>(this.infoArticleService.getInfo(idInfo),HttpStatus.FOUND);
		}
		
		@GetMapping("/getInfoArticles")
		public ResponseEntity<List<InfoArticleBean>> getInfoArticles(){
			return new ResponseEntity<List<InfoArticleBean>>(this.infoArticleService.getInfoArticles(), HttpStatus.OK);
		}
		@DeleteMapping("delete/{idInfo}")
		public ResponseEntity<Boolean> deleteInfo(@PathVariable("idInfo") int idInfo){
			return new ResponseEntity<Boolean>(this.infoArticleService.deletInfo(idInfo), HttpStatus.OK);
		}
}
