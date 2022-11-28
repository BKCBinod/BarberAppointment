package com.cg.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.FeedBack;
import com.cg.repository.FeedbackRepo;

@Service
public class FeedBackService {

	
	@Autowired
	FeedbackRepo repo;
	
	
	
	public FeedBack addfeedback(FeedBack fedback) {
		
		return repo.save(fedback);
		
	}
	
	public List<FeedBack>  getAllfeedBack(){
		List<FeedBack> li=repo.findAll();
		
		return li;
	}
	
	
}
