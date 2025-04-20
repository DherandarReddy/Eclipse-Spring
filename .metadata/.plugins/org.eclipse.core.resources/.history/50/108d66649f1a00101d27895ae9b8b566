package com.cts.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propTest {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/propertyplaceholder/assignment/propconfig.xml");
		clientDAO a=(clientDAO)cnt.getBean("clientdao");
		System.out.println(a);
	}

}
