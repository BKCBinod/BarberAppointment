package com.cg.servises;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Admin;
import com.cg.model.BarberServiceList;
import com.cg.repository.Adminrepo;
import com.cg.repository.BarberServicesRepo;



@Service
public class AdminService implements AdminServiceIf{
	
	
	@Autowired
	private Adminrepo adminrepo;
	

	
	@Autowired
	private BarberServicesRepo barberServiceRepo;
	
	
	
	



	//find by admin details
	
	 public Admin fetchAdminByEmailId(String email) {

		return adminrepo.findByAdminEmail(email).orElseThrow(() -> new ResourceNotFoundException("Admin", "Name", email));
		
	}
	
		
		
	// add barbers serves and price

	public  BarberServiceList addBarberService(BarberServiceList barberServiceList) {
		BarberServiceList bs = barberServiceRepo.save( barberServiceList);
		return bs;
	}
		
	// update barber exerting services and prices
	
	public BarberServiceList updateService(Integer serviceId, BarberServiceList barberServiceList) {
		 BarberServiceList bsl = barberServiceRepo.findById(serviceId).get();
		 bsl.setServiceId(barberServiceList.getServiceId());
		bsl.setServiceName(barberServiceList.getServiceName());
		bsl.setServicePrice(barberServiceList.getServicePrice());

		
		return  barberServiceRepo.saveAndFlush (bsl);
	}
		
	
	//remove barber services
	
	public  String deleteService(int serviceId) {
		barberServiceRepo.deleteById(serviceId);
		return "Deleted";		
	}
	
	// see all barbers services
	
	public List<BarberServiceList> getallServices(){
		return barberServiceRepo.findAll();		
	}



	public Admin fetchUserByemailIdAndPassword(Admin admin) {
		String tempEmailId = admin.getAdminEmail();
		String temppass = admin.getAdminPassword();
		Admin adminObj = null;
			if((tempEmailId) != null && temppass != null){				
					adminObj = adminrepo.findByAdminEmailAndAdminPassword(tempEmailId, temppass);	
				}
			
			if(adminObj == null) {
				throw new  ResourceNotFoundException("Admin", "email", adminObj);	
		
		}

		return adminObj;
	}
	
		
	
}


