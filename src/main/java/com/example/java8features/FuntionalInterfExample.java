package com.example.java8features;
@FunctionalInterface
//Specify explicitly an interface in functional interface so that compiler will check at compile time if there is one abstract method or not
public interface FuntionalInterfExample {
	public void m1();
	default void m2(){
	}
	public static void m3(){
	}
}
