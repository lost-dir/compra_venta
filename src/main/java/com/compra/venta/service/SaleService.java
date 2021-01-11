package com.compra.venta.service;

import java.util.List;

import com.compra.venta.bean.SaleBean;

//import com.compra.venta.model.Sale;

public interface SaleService {
	//save a new sale
	public int saveSale(SaleBean saleBean);
	
	//update an existing sale
	public int updateSale(SaleBean saleBean);
	
	//get an existing sale
	public SaleBean getSale(int idSales);
	
	//get all sales
	public List<SaleBean> getSales();
	
	//delete an existing sale
	public boolean deleteSale(int idSale);
}
