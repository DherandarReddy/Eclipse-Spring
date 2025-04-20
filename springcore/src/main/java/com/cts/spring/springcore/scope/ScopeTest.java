package com.cts.spring.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext cnt=new ClassPathXmlApplicationContext("com/cts/spring/springcore/scope/scopeconfig.xml");
		University uni=(University) cnt.getBean("university");
		System.out.println(uni);
	}

}
