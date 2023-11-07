package com.abby.models;

public class Person {
private int id;
private String name;
private int age;
private long weight;


public Person(int id, String name, int age, long weight) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.weight = weight;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getWeight() {
	return weight;
}
public void setWeight(long weight) {
	this.weight = weight;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
}



}
