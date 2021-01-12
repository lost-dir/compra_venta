package com.compra.venta.service;

import java.util.List;

import com.compra.venta.bean.InfoArticleBean;

public interface InfoArticleService {
	public int saveInfo(InfoArticleBean infoArticleBean);
	public boolean updateInfo(InfoArticleBean infoArticleBean);
	public InfoArticleBean getInfo(int idInfo);
	public List<InfoArticleBean> getInfoArticles();
	public boolean deletInfo(int idInfo);
}
