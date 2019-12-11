package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.BiFunction;
//Creation of Student object by using name and rollNumber
public class BiFunctionEx2 {
	public static void main(String[] args){
		ArrayList<Student1> l=new ArrayList<>();
		BiFunction<String,Integer,Student1> bf=(name,rollNo)->new Student1(name,rollNo);
             l.add(bf.apply("lalitha",10));
             l.add(bf.apply("jaya",20));
		//System.out.println(l);

		for(Student1 s:l){
			System.out.println("Name :"+s.name);
			System.out.println("Roll No :"+s.rollNo);
		}
	}


}

class Student1{
	String name;
	int rollNo;

	public Student1(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
}
