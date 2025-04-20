package com.cts.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class innerbeansTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("com/cts/spring/springcore/innerbeans/innerbeansconfig.xml");
		Employee bean = (Employee) c.getBean("employee");
		System.out.println(bean);
	}

}
