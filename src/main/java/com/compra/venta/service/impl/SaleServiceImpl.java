package com.compra.venta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compra.venta.bean.SaleBean;
import com.compra.venta.model.Sale;
import com.compra.venta.repository.SaleRepository;
//import com.compra.venta.bean.ArticleBean;
//import com.compra.venta.service.ArticleService;
import com.compra.venta.service.SaleService;

@Service
@Transactional
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepo;
	
	@Override
	public int saveSale(SaleBean saleBean) {
		Sale sale = new Sale();
		sale.setSaleDate(saleBean.getSaleDate());
		sale.setUser(saleBean.getUser());
		sale.setArticle(saleBean.getArticle());
		this.saleRepo.save(sale);
		return sale.getIdSale();
	}

	@Override
	public int updateSale(SaleBean saleBean) {
		Sale sale = this.saleRepo.findById(saleBean.getIdSale()).orElseThrow();
		sale.setSaleDate(saleBean.getSaleDate());
		sale.setUser(saleBean.getUser());
		sale.setArticle(saleBean.getArticle());
		this.saleRepo.save(sale);
		return sale.getIdSale();
	}

	@Override
	public SaleBean getSale(int idSale) {
		Sale sale = this.saleRepo.findById(idSale).orElseThrow();
		SaleBean saleBean = new SaleBean();
		saleBean.setIdSale(sale.getIdSale());
		saleBean.setSaleDate(sale.getSaleDate());
		saleBean.setUser(sale.getUser());
		saleBean.setArticle(sale.getArticle());
		return saleBean;
	}

	@Override
	public List<SaleBean> getSales() {
		List<Sale> saleList = this.saleRepo.findAll();
		List<SaleBean> saleBeanList = new ArrayList<>();
		for(int i = 0; i < saleList.size(); i++) {
			SaleBean saleBean = new SaleBean();
			saleBean.setIdSale(saleList.get(i).getIdSale());
			saleBean.setSaleDate(saleList.get(i).getSaleDate());
			saleBean.setUser(saleList.get(i).getUser());
			saleBean.setArticle(saleList.get(i).getArticle());
			saleBeanList.add(saleBean);
		}
		return saleBeanList;
	}

	@Override
	public boolean deleteSale(int idSale) {
		Sale sale = this.saleRepo.findById(idSale).orElseThrow();
		this.saleRepo.delete(sale);
		return true;
	}
}
