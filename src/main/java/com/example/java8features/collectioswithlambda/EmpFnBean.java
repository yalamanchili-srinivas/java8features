package com.example.java8features.collectioswithlambda;

public class EmpFnBean {
	String name;
	Double salary;

	public EmpFnBean(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
		return name+":"+salary;
	}
}
