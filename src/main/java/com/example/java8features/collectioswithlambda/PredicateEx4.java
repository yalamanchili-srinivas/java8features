package com.example.java8features.collectioswithlambda;

import java.util.function.Predicate;

public class PredicateEx4 {
	//all names start with k
	public static void main(String[] args){
		String[] names={"lalitha","karuna","jaya","kajal","ken"};
		Predicate<String> p=s->s.charAt(0)=='k';
		System.out.println("Names start with k :");
		for (String s1:names){
			if(p.test(s1)){
				System.out.println(s1);
			}
		}
		//System.out.println(s);
	}
}
