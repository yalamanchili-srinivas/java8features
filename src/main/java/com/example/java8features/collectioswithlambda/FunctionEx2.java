package com.example.java8features.collectioswithlambda;

import java.util.function.Function;

public class FunctionEx2 {
	public static void main(String[] args){
		String s="Durga Software Solutions";
		Function<String,String> f= s1->s1.replaceAll(" ","");
		System.out.println(f.apply(s));
		//int count =0;
		//Count number of spaces in string
		Function<String,Integer> f2= s2->s2.length()-s2.replaceAll(" ","").length();
		System.out.println(f2.apply(s));
	}
}
