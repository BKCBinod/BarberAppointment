package com.cg.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Admin;


public interface Adminrepo extends JpaRepository<Admin , Integer> {
	
	public Optional <Admin> findByAdminEmail(String email);
	public Admin findByAdminEmailAndAdminPassword(String email, String password);
	
}