package com.cts.spring.springcore.shopping;

public class Items {
private int id;
private String name;
private double price;
private int quality;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuality() {
	return quality;
}
public void setQuality(int quality) {
	this.quality = quality;
}
@Override
public String toString() {
	return "Items [id=" + id + ", name=" + name + ", price=" + price + ", quality=" + quality + "]";
}

}
