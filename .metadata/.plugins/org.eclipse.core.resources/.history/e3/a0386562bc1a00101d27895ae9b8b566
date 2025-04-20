package com.cts.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autoTest {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcoreadvanced/autowiring/assignment/autoconfig.xml");
		Customer a=(Customer)cnt.getBean("customer");
		System.out.println(a);
	}

}
