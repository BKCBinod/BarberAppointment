package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Barber;

public interface BarberRepository  extends JpaRepository<Barber,Integer> {

	
	
}
