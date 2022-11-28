package com.cg.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "Admin_Details")
	@Builder
	public class Admin {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Admin_Id")
		private int adminId;
		@Column(name = "Admin_Name")
		private String adminName;
		
		@Column(name = "Admin_email")
		private String adminEmail;
		
		@Column(name = "Admin_Password")
		private String adminPassword;

		public int getAdminId() {
			return adminId;
		}

		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getAdminEmail() {
			return adminEmail;
		}

		public void setAdminEmail(String adminEmail) {
			this.adminEmail = adminEmail;
		}

		public String getAdminPassword() {
			return adminPassword;
		}

		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

		public Admin(int adminId, String adminName, String adminEmail, String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminEmail = adminEmail;
			this.adminPassword = adminPassword;
		}

		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}



		
	}

