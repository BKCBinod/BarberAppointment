package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Feedback_Id")
	private int feedback_Id;
	
	@Column(name="feedback_comments")
	String comments;
	
	
	
	public int getFeedback_Id() {
		return feedback_Id;
	}

	public FeedBack() {
		super();
	}

	public FeedBack(int feedback_Id, String comments, int barberid, String customerMail) {
		super();
		this.feedback_Id = feedback_Id;
		this.comments = comments;
		this.barberid = barberid;
		this.customerMail = customerMail;
	}

	public void setFeedback_Id(int feedback_Id) {
		this.feedback_Id = feedback_Id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getBarberid() {
		return barberid;
	}

	public void setBarberid(int barberid) {
		this.barberid = barberid;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	@Column(name="barberid")
	int barberid;
	
	@Column(name="barbername")
	String customerMail;
	
}
