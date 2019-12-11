package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class StreamAverage {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(3.0);
		list.add(null);
		list.add(5.0);
		list.add(null);

		OptionalDouble sumList = list.stream().filter(Objects::nonNull)
				.mapToDouble(i -> i)
				.average();
		System.out.println("Sum :" + sumList);
	}
}
