package com.cts.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHsp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/cts/spring/springcore/list/listconfig.xml");
		Hospital hs = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name: " + hs.getName());
		System.out.println("Department Name: " + hs.getDepartments());
		System.out.println("List type: "+hs.getDepartments().getClass());
		
	}

}
