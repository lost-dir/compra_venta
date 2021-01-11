package com.compra.venta.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.NotNull;

public class SaleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSale;
	
	@NotNull
	private Date saleDate;

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
}
