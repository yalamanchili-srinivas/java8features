package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateEx3 {
	public  static void main(String[] args){
		Predicate<Collection> p=c->c.isEmpty();

		ArrayList<String> l1=new ArrayList<>();
		l1.add("jaya");
		System.out.println(p.test(l1));
		ArrayList<String> l2=new ArrayList<>();
		System.out.println(p.test(l2));
	}
}
