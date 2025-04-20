package com.cts.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Emp id : "+emp.getEmpid());
		System.out.println("Emp name : "+emp.getEmpname());
		ctx.close();
	}
}
