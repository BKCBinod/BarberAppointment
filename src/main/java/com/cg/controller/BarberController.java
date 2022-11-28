package com.cg.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.DuplicateEntryException;
import com.cg.exception.No_Data_Found;
import com.cg.model.Barber;
import com.cg.servises.BarberService;



@RestController
@RequestMapping("/BarberController")
@CrossOrigin(origins = "http://localhost:4200")
public class BarberController {

	
Logger log=LoggerFactory.getLogger(Barber.class);
	
	@Autowired
	private BarberService serv;

	/*
	 * http://localhost:8081/BarberController/add
	 */
	@PostMapping(consumes = "application/json", produces = "application/json", path="/add")	
	public ResponseEntity<Barber> addBarbers (@RequestBody Barber products) throws DuplicateEntryException {
		Barber products1= serv.resister(products);
		log.info("products Added successfully");
		ResponseEntity<Barber> response= new ResponseEntity<Barber>(products1, HttpStatus.OK);
		return response;
	}


	
	/*
	 * http://localhost:8081/BarberController/deleteById/{Id}
	 */
	 @DeleteMapping(produces = "application/json",path = "/deleteById/{Id}")
	public  String deleteBarberById(
			@PathVariable("Id")int productsId) throws No_Data_Found{
		 serv.deleteBarberById(productsId);
		log.info("products updated successfully by Id");
		return "product id"+productsId+"is  deleted";
		
	}
	
	 // http://localhost:8081/BarberController/viewById/{Id}
	 
	 @GetMapping(produces = "application/json",path = "/viewById/{Id}")
	public Barber viewProductById(@PathVariable("Id") int productsId) throws No_Data_Found
	{
		 Barber products= serv.viewABarbersById(productsId);
		log.info("view barber by ID");
		return products;
	}
	/*
	 * http://localhost:8081/BarberController/getAllBarbers
	 */
	@GetMapping("/getAllBarbers")
	public List<Barber> viewAllBarberList(){
		log.info("Barber viewed successfully by Id");
		return serv.viewAllBarbers();
	}
	/*
	 * http://localhost:8081/BarberController/getAllBarbersAvailable
	 */
	@GetMapping("/getAllBarbersAvailable")
	public List<Barber> viewAllAvailBarberList(){
		log.info("Barber viewed successfully ");
		return serv.viewAllAvailabeBarbers();
	}
	
//	http://localhost:8081/BarberController/updateAvlable/{Id}
	@PutMapping("/updateAvlable/{Id}")
	public void updateAvlable(@PathVariable("Id")Integer Id , @RequestBody Barber product) throws  No_Data_Found {
		serv.avlstatus(product, Id);
		
	}
	
	
//	http://localhost:8081/BarberController/updateUnavlable/{Id}
	@PutMapping("/updateUnavlable/{Id}")
	public void updateUnavlable(@PathVariable("Id")Integer Id , @RequestBody Barber product) throws  No_Data_Found {
		serv.Unavlstatus(product,Id);
		
	}
//	http://localhost:8081/BarberController/updateRating/{Id}
	@PutMapping("/updateRating/{Id}")
	public void rating(@PathVariable("Id")Integer Id , @RequestBody Barber product) throws  No_Data_Found {
		serv.rating(product, Id);
		
	}
	
	
}
