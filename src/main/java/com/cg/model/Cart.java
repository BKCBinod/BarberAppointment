package com.cg.model;



import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="cart")
@Builder
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cart_Id")
	private  int cartId;
	@Column(name = "User_Id")
	private int userid;
	@Column(name = "Bsl_Id")
	private  int bslid;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBslid() {
		return bslid;
	}
	public void setBslid(int bslid) {
		this.bslid = bslid;
	}
	
	public Cart(int cartId, int userid, int bslid) {
		super();
		this.cartId = cartId;
		this.userid = userid;
		this.bslid = bslid;
	}
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
