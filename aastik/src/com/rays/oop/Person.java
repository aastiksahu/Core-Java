package com.rays.oop;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String addresss;

	public String getName() {
		
		return this.name;
	
	}

	public void setName(String name) {

		this.name = name;

	}

	public String getAddress() {

		return this.addresss;

	}

	public void setAddress(String address) {

		this.addresss = address;

	}

	public Date getDob() {

		return this.dob;

	}

	public void setDob(Date dob) {

		this.dob = dob;

	}

}
