package com.compra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compra.venta.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
