package com.cts.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propTest {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/propertyplaceholder/cinjconfig.xml");
		myDAO a=(myDAO)cnt.getBean("mydao");
		System.out.println(a);
	}

}
