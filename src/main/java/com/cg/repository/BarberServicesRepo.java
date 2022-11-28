package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.BarberServiceList;

public interface BarberServicesRepo extends JpaRepository<BarberServiceList, Integer> {	

}
