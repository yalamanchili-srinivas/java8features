package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerEx2 {
	public static void main(String[] args){
		ArrayList<Employee22> l=new ArrayList<>();
		BiFunction<String,Double,Employee22> bf=(name,salary)->new Employee22(name,salary);
		l.add(bf.apply("lalitha",2000.0));
		l.add(bf.apply("jaya",3000.0));
		l.add(bf.apply("siri",4000.0));
		BiConsumer<Employee22,Double> bc=(e,d)->e.salary=e.salary+d;
		for(Employee22 e:l){
			bc.accept(e,500.0);
		}
		for(Employee22 e1:l){
			System.out.println("Name :"+e1.name);
			System.out.println("Salary :"+e1.salary);
		}
	}
}
class  Employee22{
	String name;
	double salary;

	public Employee22(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}