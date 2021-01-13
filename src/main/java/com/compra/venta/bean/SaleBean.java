package com.compra.venta.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.NotNull;

import com.compra.venta.model.Article;
import com.compra.venta.model.User;

public class SaleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSale;
	
	@NotNull
	private Date saleDate;
	
	private User user;
	
	private Article article;

	//CONSTRUCTORS
	public SaleBean() {
	}

	public SaleBean(int idSale) {
		this.idSale = idSale;
	}

	//GETTERS & SETTERS
	public int getIdSale() {
		return idSale;
	}

	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
