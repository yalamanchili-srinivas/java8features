package com.example.java8features.collectioswithlambda;

import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args){
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		tm.put(100,"lalitha");
		tm.put(200,"susmith");
		tm.put(500,"jaya");
		tm.put(600,"sowji");
		tm.put(400,"ramya");
		tm.put(300,"siri");
		System.out.println("Before Sorting"+tm);
	}
}
