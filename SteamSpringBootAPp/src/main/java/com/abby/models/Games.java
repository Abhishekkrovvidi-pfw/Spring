package com.abby.models;

public class Games {
private int id;
private String name;
private float hours;
public Games(int id, String name, float hours) {
	super();
	this.id = id;
	this.name = name;
	this.hours = hours;
}

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
public float getHours() {
	return hours;
}
public void setHours(float hours) {
	this.hours = hours;
}
@Override
public String toString() {
	return "Games [id=" + id + ", name=" + name + ", hours=" + hours + "]";
}



}
