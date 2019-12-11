package com.example.java8features.collectioswithlambda;

import java.util.function.Supplier;
//to get random opt 6 digit number
public class SupplierEx3 {
	public static void main(String[] args){
		Supplier<String> s=()->{
			String opt="";
			for(int i=0;i<=6;i++){
				opt=opt+(int)(Math.random()*10);
		}
			return opt;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
