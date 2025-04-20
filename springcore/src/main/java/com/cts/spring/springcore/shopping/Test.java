package com.cts.spring.springcore.shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/spring/springcore/shopping/config.xml");
		ShoppingCart shop = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(shop);
	}
}
