package com.compra.venta.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.compra.venta.model.InfoArticle;

public class ArticleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idArticle;
	
	@NotNull
	@Size(max = 100)
	private String nameArticle;
	
	@NotNull
	private double priceArticle;
	
	private InfoArticle infoArticle;

	//CONSTRUCTORS
	public ArticleBean() {
	}

	public ArticleBean(int idArticulo) {
		this.idArticle = idArticulo;
	}
	
	//GETTERS & SETTERS
	public int getIdArticulo() {
		return idArticle;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticle = idArticulo;
	}

	public String getNameArticle() {
		return nameArticle;
	}

	public void setNameArticle(String nameArticle) {
		this.nameArticle = nameArticle;
	}

	public double getPriceArticle() {
		return priceArticle;
	}

	public void setPriceArticle(double priceArticle) {
		this.priceArticle = priceArticle;
	}

	public InfoArticle getInfoArticle() {
		return infoArticle;
	}

	public void setInfoArticle(InfoArticle infoArticle) {
		this.infoArticle = infoArticle;
	}
}
