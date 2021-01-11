package com.compra.venta.bean;

import java.io.Serializable;

//import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoArticleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idInfo;
	
	@NotNull
	@Size(max = 50)
	private String category;
	
	@NotNull
	private double iva;
	
	@NotNull
	private int stock;

	//CONSTRUCTORS
	public InfoArticleBean() {
	}

	public InfoArticleBean(int idInfo) {
		this.idInfo = idInfo;
	}

	//GETTERS & SETTERS
	public int getIdInfo() {
		return idInfo;
	}

	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
