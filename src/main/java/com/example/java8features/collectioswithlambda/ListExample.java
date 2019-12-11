package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
public static void main(String[] args){
	ArrayList<Integer> l= new ArrayList<>();
	l.add(10);
	l.add(0);
	l.add(5);
	l.add(15);
	l.add(20);
	System.out.println("Before Sorting"+l);
	//Default natural sorting order
	Collections.sort(l);
	System.out.println("After Sorting Asending"+l);
	//Customised sorting order
	Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	System.out.println("Desending order"+l);
}

}
