package com.example.java8features.collectioswithlambda;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args){
		//Find Length of the String
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("lalitha"));
		System.out.println(f.apply("jaya"));
		//write square of the given number
		Function<Integer,Integer> f2=i->i*i;
		System.out.println(f2.apply(3));
	}

}
