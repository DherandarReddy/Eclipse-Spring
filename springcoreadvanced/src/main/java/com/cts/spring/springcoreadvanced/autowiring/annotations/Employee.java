package com.cts.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
//	private int id;
	private Address address;
	private Cat cat;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Employee [address=" + address + ", cat=" + cat + "]";
	}

	public Cat getCat() {
		return cat;
	}
	
	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
}
