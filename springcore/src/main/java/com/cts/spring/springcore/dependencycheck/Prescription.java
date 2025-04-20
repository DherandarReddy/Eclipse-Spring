package com.cts.spring.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
private int id;
private String name;
public int getId() {
	return id;
}
@Required
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Prescription [id=" + id + ", name=" + name + "]";
}

}
