package com.compra.venta.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sale")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sale")
	private int idSale;
	
	@Column(name = "sale_date", nullable = false)
	private Date saleDate;
	
	//***RELACIONES DE MUCHOS A UNO***
	@ManyToOne
	@JoinColumn(name = "mail")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_articulo")
	private Article article;
	//***FIN DE LAS RELACIONES***

	//CONSTRUCTORS
	public Sale() {
	}

	public Sale(int idSale) {
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
