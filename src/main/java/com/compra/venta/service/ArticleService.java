package com.compra.venta.service;

import java.util.List;

import com.compra.venta.bean.ArticleBean;

public interface ArticleService {
	//save a new article
	public int saveArticle(ArticleBean articleBean);
	
	//update an existing article in data base
	public int updateArticle(ArticleBean articleBean);
	
	//get an existing article by id
	public ArticleBean getArticle(int idArticle);
	
	//get all articles
	public List<ArticleBean> getArticles();
	
	//delete an existing article
	public boolean deleteArticle(int idArticle);
}
