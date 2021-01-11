package com.compra.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info_article")
public class InfoArticle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_info")
	private int idInfo;
	
	@Column(name = "category", nullable = false, length = 50)
	private String category;
	
	@Column(name = "iva", nullable = false)
	private double iva;
	
	@Column(name = "stock")
	private int stock;
	
	//CONSTRIUCTORS
	public InfoArticle() {
	}

	public InfoArticle(int idInfo) {
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
