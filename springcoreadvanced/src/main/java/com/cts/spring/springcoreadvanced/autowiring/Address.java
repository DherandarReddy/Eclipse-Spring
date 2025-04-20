package com.cts.spring.springcoreadvanced.autowiring;

public class Address {
	private int hno;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}
	
}
