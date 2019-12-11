package com.example.java8features.invokelambdaexp;

import com.example.java8features.invokelambdaexp.Interf2;

public class Test2 {
	public static void main(String[] args){
		Interf2 i2= (a,b)-> System.out.println("The sum is:"+(a+b));
		i2.add(10,20);
		i2.add(100,200);
	}
}
