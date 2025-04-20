package com.cts.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mapTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/map/mapconfig.xml");
		Customer c=(Customer) cnt.getBean("customer");
		System.out.println("Customer id: "+c.getId());
		System.out.println("Product Details : "+c.getProducts());
		System.out.println("Products : "+c.toString());
	}
	
}
