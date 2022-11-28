package com.cg.servises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.exception.DuplicateEntryException;
import com.cg.exception.No_Data_Found;
import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Barber;
import com.cg.repository.BarberRepository;



@Service
public class BarberService {

	@Autowired
	public BarberRepository repo;
	
	public  Barber resister(Barber barber)  throws DuplicateEntryException  {
		
		List<Barber> li=repo.findAll();
		
		
		
		for(Barber u:li) {
			if(u.getName().equals(barber.getName()))throw  new DuplicateEntryException("barber", "name",barber.getName());
		}
		Barber barber1=repo.save(barber);
		return barber1;
	}
	
	
	

	

	
	@Transactional
	public String deleteBarberById(int barberId) throws No_Data_Found {
		Optional<Barber> pa=repo.findById(barberId);
		Barber getbarbers=null;
		if(pa.isPresent())
		{
			 getbarbers=pa.get();
			 repo.delete(getbarbers);
			 return "Deleted sucessfully";
			
		}
		else
		  {
			throw new  No_Data_Found("invalid id found");
		   }
		
		}
	
	public Barber viewABarbersById( int id) 
	{
		Barber b=repo.findById(id).get();
		return b ;
	}
	
	public List<Barber> viewAllBarbers() 
	{
		List<Barber> listBarber=repo.findAll();
		return listBarber;
	}
	
	
		public void  avlstatus( Barber barber,int id) {
			Barber b=repo.findById(id).get();
			b.setStatus(barber.getStatus());
			repo.save(b);
		}
		
		public void  Unavlstatus( Barber barber,int id) {
			Barber b=repo.findById(id).get();
			b.setStatus(barber.getStatus());
			repo.save(b);
		}
		public void  rating( Barber barber,int id) {
			Barber b=repo.findById(id).get();
			b.setRating(barber.getRating());
			repo.save(b);
		}
		
		public List<Barber> viewAllAvailabeBarbers() 
		{
			List<Barber> listBarber=repo.findAll();
		     List<Barber>avllist=new ArrayList<Barber>();
			
		     for(Barber b:listBarber) {
		    	 if(b.getStatus().equals("available")) {
		    		 avllist.add(b);
		    	 }
		     }
		     
		     return avllist;
		}
		
		
}
