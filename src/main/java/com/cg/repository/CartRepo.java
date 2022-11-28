package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Cart;

@Repository
public interface CartRepo extends JpaRepository <Cart, Integer>{
	
public List<Cart>findByUserid(int id);

public Cart findByBslidAndUserid(int serviceId , int userId);

}
