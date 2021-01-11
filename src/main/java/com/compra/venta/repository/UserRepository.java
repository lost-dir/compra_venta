package com.compra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compra.venta.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
