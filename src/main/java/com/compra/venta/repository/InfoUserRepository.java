package com.compra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compra.venta.model.InfoUser;

@Repository
public interface InfoUserRepository extends JpaRepository<InfoUser, Integer> {

}
