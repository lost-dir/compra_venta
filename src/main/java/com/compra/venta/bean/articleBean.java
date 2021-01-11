package com.compra.venta.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class articleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idArticulo;
	
	@NotNull
	@Size(max = 100)
	private String nameArticle;
	
	@NotNull
	private double priceArticle;

	//CONSTRUCTORS
	public articleBean() {
	}

	public articleBean(int idArticulo, @NotNull @Size(max = 100) String nameArticle, @NotNull double priceArticle) {
		this.idArticulo = idArticulo;
		this.nameArticle = nameArticle;
		this.priceArticle = priceArticle;
	}
	
	//GETTERS & SETTERS
	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
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
}
