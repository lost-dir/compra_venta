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

import com.compra.venta.bean.ArticleBean;
import com.compra.venta.service.impl.ArticleServiceImpl;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleServiceImpl articleService;
	
	@PostMapping("/saveArticle")
	public ResponseEntity<Integer> saveArticle(@Valid @RequestBody ArticleBean articleBean){
		return new ResponseEntity<Integer>(this.articleService.saveArticle(articleBean), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateArticle")
	public ResponseEntity<Integer> updateArticle(@Valid @RequestBody ArticleBean articleBean){
		return new ResponseEntity<Integer>(this.articleService.updateArticle(articleBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getArticle/{idArticle}")
	public ResponseEntity<ArticleBean> getUser(@PathVariable("idArticle") int idArticle){
		return new ResponseEntity<ArticleBean>(this.articleService.getArticle(idArticle), HttpStatus.FOUND);
	}
	
	@GetMapping("/getArticles")
	public ResponseEntity<List<ArticleBean>> getUsers(){
		return new ResponseEntity<List<ArticleBean>>(this.articleService.getArticles(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteArticle/{idArticle}")
	public ResponseEntity<Boolean> deleteArticle(@PathVariable("idArticulo") int idArticulo){
		return new ResponseEntity<Boolean>(this.articleService.deleteArticle(idArticulo), HttpStatus.OK);
	}
}
