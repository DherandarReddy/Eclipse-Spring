package com.cts.spring.springcoreadvanced.autowiring.assignment;

public class Reservation {
	private int id;
	private String time;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
