package com.example.java8features.collectioswithlambda;

public class Employee1 {
	String name;
	String designation;
	double salary;
	String city;

	public Employee1(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	public String toString(){
		return String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
	}
}
