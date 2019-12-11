package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDisplay {
	public static void main(String[] args){
		ArrayList<Movie> l=new ArrayList<>();
		populate(l);

		Consumer<Movie> c=m->{
			System.out.println("Movie Name "+m.name);
			System.out.println("Heroine "+m.heroine);
		};
		for(Movie m:l){
		c.accept(m);
		}

	}
	public static void populate(ArrayList<Movie> l){
		l.add(new Movie("si","Genelia"));
		l.add(new Movie("f2","tamana"));
	}
}
