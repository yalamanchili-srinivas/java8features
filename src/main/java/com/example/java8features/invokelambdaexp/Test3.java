package com.example.java8features.invokelambdaexp;

import com.example.java8features.invokelambdaexp.Interf3;

public class Test3 {
	public static void main(String[] args){
		Interf3 i3= s->s.length();
		System.out.println(i3.getLength("Hello"));
		System.out.println(i3.getLength("with Lambda exp"));
	}
}
