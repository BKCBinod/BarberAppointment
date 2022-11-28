package com.cg.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Entity
@Table( name="barber")
@Builder
public class Barber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Barber_Id")
	private int barberId;
	
	@Column(name="Barber_Name")
	String name;
	
	@Column(name="Barber_Skills")
	String skills;
	
	@Column(name="ratings")
	 private int rating;
	
	
	@Column(name="Barber_Status")
	 private String status;
	
	
	@Column(name="serv_price")
	private  int price;

	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Barber(int barberId, String name, String skills, String status,int rating,int price) {
		super();
		this.barberId = barberId;
		this.name = name;
		this.skills = skills;
		this.status = status;
		this.rating=rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Barber() {
		super();
	}

	public int getBarberId() {
		return barberId;
	}

	public void setBarberId(int barberId) {
		this.barberId = barberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
