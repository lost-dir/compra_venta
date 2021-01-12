package com.compra.venta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compra.venta.bean.ArticleBean;
import com.compra.venta.model.Article;
import com.compra.venta.repository.ArticleRepository;
import com.compra.venta.service.ArticleService;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleRepository articleRepo;
	
	@Override
	public int saveArticle(ArticleBean articleBean) {
		Article article = new Article();
//		article.setIdArticle(articleBean.getIdArticulo());
		article.setNameArticle(articleBean.getNameArticle());
		article.setPriceArticle(articleBean.getPriceArticle());
		this.articleRepo.save(article);
		return article.getIdArticle();
	}

	@Override
	public int updateArticle(ArticleBean articleBean) {
		Article article = this.articleRepo.findById(articleBean.getIdArticulo()).orElseThrow();
		article.setNameArticle(articleBean.getNameArticle());
		article.setPriceArticle(articleBean.getPriceArticle());
		this.articleRepo.save(article);
		return article.getIdArticle();
	}

	@Override
	public ArticleBean getArticle(int idArticle) {
		Article article = this.articleRepo.findById(idArticle).orElseThrow();
		ArticleBean articleBean = new ArticleBean();
		articleBean.setIdArticulo(article.getIdArticle());
		articleBean.setNameArticle(article.getNameArticle());
		articleBean.setPriceArticle(article.getPriceArticle());
		articleBean.setInfoArticle(article.getInfoArticle());
		return articleBean;
	}

	@Override
	public List<ArticleBean> getArticles() {
		List<Article> articleList = this.articleRepo.findAll();
		List<ArticleBean> articleBeanList = new ArrayList<>();
		for(int i = 0; i < articleList.size(); i++) {
			ArticleBean articleBean = new ArticleBean();
			articleBean.setIdArticulo(articleList.get(i).getIdArticle());
			articleBean.setNameArticle(articleList.get(i).getNameArticle());
			articleBean.setPriceArticle(articleList.get(i).getPriceArticle());
			articleBean.setInfoArticle(articleList.get(i).getInfoArticle());
			articleBeanList.add(articleBean);
		}
		return articleBeanList;
	}

	@Override
	public boolean deleteArticle(int idArticle) {
		Article article = this.articleRepo.findById(idArticle).orElseThrow();
		this.articleRepo.delete(article);
		return true;
	}

}
