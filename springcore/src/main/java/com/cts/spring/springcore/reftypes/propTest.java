package com.cts.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class propTest {
	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/reftypes/mapconfig.xml");
		Student c=(Student) cnt.getBean("student");
		System.out.println(c);
	}
	
}
