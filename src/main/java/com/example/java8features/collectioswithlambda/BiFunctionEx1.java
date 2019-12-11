package com.example.java8features.collectioswithlambda;

import java.util.function.BiFunction;

public class BiFunctionEx1 {
	public static void main(String[] args){
		BiFunction<Integer,Integer,Integer> bp=(a,b)->a*b;
		System.out.println(bp.apply(10,20));
		System.out.println(bp.apply(100,200));
	}
}
