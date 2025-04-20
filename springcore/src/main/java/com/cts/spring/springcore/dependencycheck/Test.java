package com.cts.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcore/dependencycheck/config.xml");
		Prescription pre = (Prescription) ctx.getBean("prescription");
		System.out.println(pre);
	}
}
