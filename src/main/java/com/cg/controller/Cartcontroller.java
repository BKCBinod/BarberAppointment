package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.model.BarberServiceList;
import com.cg.servises.CartServicesIf;

@RestController
@RequestMapping("/cart")
public class Cartcontroller {
	
	
	@Autowired
	CartServicesIf cs;


	@CrossOrigin
	@GetMapping("/showcart/{useremail}")
	//get details of card with card id
	public List<BarberServiceList> getcart(@PathVariable("useremail")String useremail ) {

		return cs.fetchCartDetails(useremail);
	}

	@CrossOrigin
	@DeleteMapping("/delete/{serviceId}/{useremail}")
	public String removeFromCart( @PathVariable("useremail")String useremail, @PathVariable("serviceId") Integer serviceId)
	{

		cs.deleteItemFromCart(serviceId , useremail);
		return "Deleted";
	}
	
	
}
