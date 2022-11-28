package com.cg.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Complaints")
@Builder
public class UserComplaints {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Complaint_Id")
	private int ComplaintId;
	@Column(name = "Complaints")
	private String Complaints;
	public int getComplaintId() {
		return ComplaintId;
	}
	public void setComplaintId(int complaintId) {
		ComplaintId = complaintId;
	}
	public String getComplaints() {
		return Complaints;
	}
	public void setComplaints(String complaints) {
		Complaints = complaints;
	}
	public UserComplaints() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserComplaints(int complaintId, String complaints) {
		super();
		ComplaintId = complaintId;
		Complaints = complaints;
	}
	
	
	
	

}
