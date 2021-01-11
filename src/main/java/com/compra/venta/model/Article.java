package com.compra.venta.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_article")
	private int idArticle;
	
	@Column(name = "name_article", nullable = false, length = 100)
	private String nameArticle;
	
	@Column(name = "price_article", nullable = false)
	private double priceArticle;
	
	//***RELACIÓN DE UNO A UNO***
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idInfo")
	private InfoArticle infoArticle;
	//***FIN DE LA RELACIÓN***

	//CONSTRUCTORS
	public Article() {
	}

	public Article(int idArticle) {
		this.idArticle = idArticle;
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

	public InfoArticle getInfoArticle() {
		return infoArticle;
	}

	public void setInfoArticle(InfoArticle infoArticle) {
		this.infoArticle = infoArticle;
	}
}
