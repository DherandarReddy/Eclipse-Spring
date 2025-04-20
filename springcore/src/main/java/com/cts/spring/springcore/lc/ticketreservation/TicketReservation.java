package com.cts.spring.springcore.lc.ticketreservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@PostConstruct
public void initialize() {
	System.out.println("Inside Init method");
}

@PreDestroy
public void cleanup() {
	System.out.println("Inside destroy method");
}

@Override
public String toString() {
	return "TicketReservation [id=" + id + "]";
}


}
