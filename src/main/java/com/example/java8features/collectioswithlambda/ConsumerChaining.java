package com.example.java8features.collectioswithlambda;

import java.util.function.Consumer;

public class ConsumerChaining {
	public static void main(String[] args){

		Consumer<ConsumerMovie> c1=m->{
			System.out.println("Movie "+m.name+" is ready to release");
		};
		Consumer<ConsumerMovie> c2=m->{
			System.out.println("Movie "+m.name+" is just realease and it is"+m.result);
		};
		Consumer<ConsumerMovie> c3=m->{
			System.out.println("Movie " +m.name +" result stored in database");
		};

		Consumer<ConsumerMovie> chainC=c1.andThen(c2).andThen(c3);
		ConsumerMovie cm=new ConsumerMovie("f2","hit");
		chainC.accept(cm);

	}
}

class ConsumerMovie{
String name;
String result;

	public ConsumerMovie(String name, String result) {
		this.name = name;
		this.result = result;
	}
}
