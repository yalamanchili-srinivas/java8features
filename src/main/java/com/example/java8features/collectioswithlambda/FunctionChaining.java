package com.example.java8features.collectioswithlambda;

import java.util.function.Function;

public class FunctionChaining {
	public static void main(String[] args){
		Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s1->s1.substring(0,9);
		System.out.println(f1.apply("LalithaSaraswathi"));
		System.out.println(f2.apply("LalithaSaraswathi"));
		System.out.println(f1.andThen(f2).apply("LalithaSaraswathi"));
		System.out.println(f1.compose(f2).apply("LalithaSaraswathi"));
	}
}
