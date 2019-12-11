package com.example.java8features.collectioswithlambda;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx1 {
	//Supplier to get System Date
	public static void main(String[] args){
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}
}
