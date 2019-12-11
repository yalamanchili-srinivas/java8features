package com.example.java8features.collectioswithlambda;

import ch.qos.logback.core.joran.conditional.ElseAction;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining3 {
	public static void main(String[] args){
		Function<String,String> f1=s -> s.toLowerCase();
		Function<String,String> f2=s1 -> s1.substring(0,5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name :");
		String userName=sc.next();
		System.out.println("Enter Password");
		String pwd=sc.next();
		if(f1.andThen(f2).apply(userName).equals("durga")&& pwd.equals("java")){
			System.out.println("Valid User");

		}else{
			System.out.println("Invalid User");
		}
	}
}
