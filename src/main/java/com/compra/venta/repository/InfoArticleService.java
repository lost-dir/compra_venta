package com.compra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compra.venta.model.InfoArticle;

@Repository
public interface InfoArticleService extends JpaRepository<InfoArticle, Integer> {

}
