package com.compra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compra.venta.model.Article;

//import com.compra.venta.model.User;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
