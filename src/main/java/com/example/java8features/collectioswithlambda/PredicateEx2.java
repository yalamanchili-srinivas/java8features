package com.example.java8features.collectioswithlambda;

import java.util.function.Predicate;

public class PredicateEx2 {
	public static void main(String[] args){

		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("lalitha"));
		System.out.println(p.test("jaya"));
	}
}
