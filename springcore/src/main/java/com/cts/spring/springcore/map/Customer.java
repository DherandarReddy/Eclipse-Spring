package com.cts.spring.springcore.map;

import java.util.Map;

public class Customer {
private int id;
private Map<String,Integer> products;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Map<String, Integer> getProducts() {
	return products;
}
public void setProducts(Map<String, Integer> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", products=" + products + "]";
}

}
