package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx5 {
	public static void main(String[] args){
		String[] names={"lalitha","",null,"jaya","",null};
		Predicate<String> p=s->s!=null && s.length()!=0;
		ArrayList<String> l1=new ArrayList<>();
		for(String s1:names){
			if(p.test(s1)){
				l1.add(s1);
			}
		}
		System.out.println("List of valid strings are");
		System.out.println(l1);
	}
}
