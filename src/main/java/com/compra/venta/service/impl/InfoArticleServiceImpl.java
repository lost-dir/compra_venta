package com.compra.venta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compra.venta.bean.InfoArticleBean;
import com.compra.venta.model.InfoArticle;
import com.compra.venta.repository.InfoArticleRepository;
import com.compra.venta.service.InfoArticleService;

@Service
@Transactional
public class InfoArticleServiceImpl implements InfoArticleService{

	 @Autowired
	 private InfoArticleRepository infoArticleRepo;
	
	@Override
	public int saveInfo(InfoArticleBean infoArticleBean) {
		InfoArticle infoArticle = new InfoArticle();
		infoArticle.setCategory(infoArticleBean.getCategory());
		infoArticle.setIva(infoArticleBean.getIva());
		infoArticle.setStock(infoArticleBean.getStock());
		this.infoArticleRepo.save(infoArticle);
		return infoArticle.getIdInfo();
	}

	@Override
	public boolean updateInfo(InfoArticleBean infoArticleBean) {
		InfoArticle infoArticle = this.infoArticleRepo.findById(infoArticleBean.getIdInfo()).orElseThrow();
		infoArticle.setCategory(infoArticleBean.getCategory());
		infoArticle.setIva(infoArticleBean.getIva());
		infoArticle.setStock(infoArticleBean.getStock());
		this.infoArticleRepo.save(infoArticle);
		return true;
	}

	@Override
	public InfoArticleBean getInfo(int idInfo) {
		InfoArticle infoArticle = this.infoArticleRepo.findById(idInfo).orElseThrow();
		InfoArticleBean infoArticleBean = new InfoArticleBean();
		infoArticleBean.setCategory(infoArticle.getCategory());
		infoArticleBean.setIva(infoArticle.getIva());
		infoArticleBean.setStock(infoArticle.getStock());
		return infoArticleBean;
	}

	@Override
	public List<InfoArticleBean> getInfoArticles() {
		List<InfoArticle> infoArticleList = this.infoArticleRepo.findAll();
		List<InfoArticleBean> infoArticleBeanList = new ArrayList<>();
		for(int i = 0; i < infoArticleList.size(); i++) {
			InfoArticleBean infoArticleBean = new InfoArticleBean();
			infoArticleBean.setIdInfo(infoArticleList.get(i).getIdInfo());
			infoArticleBean.setCategory(infoArticleList.get(i).getCategory());
			infoArticleBean.setIva(infoArticleList.get(i).getIva());
			infoArticleBean.setStock(infoArticleList.get(i).getStock());
			infoArticleBeanList.add(infoArticleBean);
		}
		return infoArticleBeanList;
	}

	@Override
	public boolean deletInfo(int idInfo) {
		InfoArticle infoArticle = this.infoArticleRepo.findById(idInfo).orElseThrow();
		this.infoArticleRepo.delete(infoArticle);
		return true;
	}
}
