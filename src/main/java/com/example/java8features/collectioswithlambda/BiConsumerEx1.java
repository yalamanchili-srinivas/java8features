package com.example.java8features.collectioswithlambda;

import java.util.function.BiConsumer;

public class BiConsumerEx1 {
	public static void main(String[] args){
		BiConsumer<String,String> bc=(s1,s2)-> System.out.println(s1+s2);
		bc.accept("lalitha","G");
	}
}
