package com.example.java8features.invokelambdaexp;

import com.example.java8features.invokelambdaexp.Interf1;

public class Test {
//Invoke Lambda Expression by calling Fuctional interface
	public static void main(String[] args){
		Interf1 i=()-> System.out.println("Lambda Expression calling");
		i.m1();
	}

}
