package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionAverage {

	public static void main(String[] args) {

		List<Double> l1 = new ArrayList<>();
		l1.add(5.0);
		l1.add(4.0);
		l1.add(3.0);
		System.out.println(l1);
		Function<List<Double>, Double> f1 = l -> {
			//System.out.println(l.size());
			double sum = 0.0;
			for (Double d : l) {
				sum = sum + d;
			}
			return sum / l.size();
		};
		System.out.println(f1.apply(l1));



	}
}
