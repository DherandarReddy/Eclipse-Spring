package com.cts.spring.springcore.scope;

import org.springframework.beans.factory.annotation.Required;

public class University {
private int id;
private String name;
private String Location;
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
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
@Override
public String toString() {
	return "University [id=" + id + ", name=" + name + ", Location=" + Location + "]";
}

}
