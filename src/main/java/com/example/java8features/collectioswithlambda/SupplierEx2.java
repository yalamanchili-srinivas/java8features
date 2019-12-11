package com.example.java8features.collectioswithlambda;

import java.util.function.Supplier;

public class SupplierEx2 {
	public static void main(String[] args){
		Supplier<String> s=()->{
			String[] s1={"sunny","bunny","ponny","chinny"};
			int x=  (int) Math.random()*4;
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());

	}
}
