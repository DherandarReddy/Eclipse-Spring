package com.cts.spring.springcore.lc.ticketreservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcore/lc/ticketreservation/config.xml");
		TicketReservation tic = (TicketReservation) ctx.getBean("ticketreservation");
		System.out.println(tic);
		ctx.registerShutdownHook();
	}
}
