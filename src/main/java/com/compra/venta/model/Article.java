package com.compra.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	private int idArticle;
	
	@Column(name = "name_article", nullable = false, length = 100)
	private String nameArticle;
	
	@Column(name = "price_article", nullable = false)
	private double priceArticle;

	//CONSTRUCTORS
	public Article() {
	}

	public Article(int idArticle, String nameArticle, double priceArticle) {
		this.idArticle = idArticle;
		this.nameArticle = nameArticle;
		this.priceArticle = priceArticle;
	}
	
	//GETTERS AND SETTTERS
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
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
