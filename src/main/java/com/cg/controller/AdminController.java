package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Admin;
import com.cg.model.BarberServiceList;
import com.cg.model.Userr;
import com.cg.servises.AdminServiceIf;
import com.cg.servises.UserrServiceIf;




@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminServiceIf adminServiceIf;
	
	@Autowired
	private UserrServiceIf userrServiceIf;
	
	
	

	/*
	 * http://localhost:8081/admin/login
	 */
	
	
	//get admin details by name while login
	@PostMapping("/login")	
	public Admin loginUser(@RequestBody Admin admin) {		
		return adminServiceIf.fetchUserByemailIdAndPassword(admin);
	}
	

	
	
	
	
	
		
	
	
		

}
		
	

		
		
	
	
	
	
	
	

	


	

