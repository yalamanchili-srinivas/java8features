package com.example.java8features.collectioswithlambda;

import java.util.function.BiFunction;

//Calculate Monthly salary by using Employee and TimeSheet with Function
public class BiFunctionEx3 {
	public static void main(String[] args){

		BiFunction<Employee11,TimeSheet,Double> bf=(e,t)->e.dialyWage*t.days;
		Employee11  e=new Employee11(10,"lalitha",1500.0);
		TimeSheet t=new TimeSheet(10,25);
		System.out.println("Monthly Salary :"+bf.apply(e,t));
 	}
}
class TimeSheet{
	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}
class Employee11{
	int eno;
	String name;
	double dialyWage;

	public Employee11(int eno, String name, double dialyWage) {
		this.eno = eno;
		this.name = name;
		this.dialyWage = dialyWage;
	}
}
