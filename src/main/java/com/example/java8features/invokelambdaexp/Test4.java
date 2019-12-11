package com.example.java8features.invokelambdaexp;

import com.example.java8features.invokelambdaexp.Interf4;

public class Test4 {
	public static void main(String[] args){
		Interf4 i4=x->x*x;
		System.out.println(i4.squareIt(3));
		System.out.println(i4.squareIt(9));
	}
}
