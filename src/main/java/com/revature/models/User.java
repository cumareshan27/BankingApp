package com.revature.models;

import com.revature.repositories.GenericRepository;

public class User{

	public String firstname;
	public String lastname;
	public String address1;
	public String address2;
	public String city; 
	public String state;
	public String zipCode;
	public String mobilephonenumber; 
	public String homephonenumber;
	
	
		public User(String firstname, String lastname, String address1, String address2, String city, String state,
			String zipCode, String mobilephonenumber, String homephonenumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobilephonenumber = mobilephonenumber;
		this.homephonenumber = homephonenumber;
	}
		
		
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getMobilephonenumber() {
		return mobilephonenumber;
	}
	public void setMobilephonenumber(String mobilephonenumber) {
		this.mobilephonenumber = mobilephonenumber;
	}
	public String getHomephonenumber() {
		return homephonenumber;
	}
	public void setHomephonenumber(String homephonenumber) {
		this.homephonenumber = homephonenumber;
	}
	

	 
}
