package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
	//Using filter() and map() methods

	public static void main(String[] args){
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(5);
		l.add(25);
		System.out.println("Before"+l);
		//List out all the even numbers to seperate List with Streams filter()
		List<Integer> l1=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("After"+l1);
//List out double values of the given List

		List<Integer> l2=l.stream().map(I->I*2).collect(Collectors.toList());

		System.out.println("Double the list values"+l2);
	}
}
