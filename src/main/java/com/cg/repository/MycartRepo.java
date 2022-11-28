package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.MyCart;

public interface MycartRepo extends JpaRepository<MyCart, Integer> {
	

}
