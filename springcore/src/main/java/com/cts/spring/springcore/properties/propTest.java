package com.cts.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/properties/mapconfig.xml");
		Countries c=(Countries) cnt.getBean("countries");
		System.out.println("Countries and Languages : "+c.toString());
	}
	
}
