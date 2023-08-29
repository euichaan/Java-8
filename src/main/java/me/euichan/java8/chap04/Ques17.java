package me.euichan.java8.chap04;

import java.util.Arrays;
import java.util.List;

public class Ques17 {

	public static void main(String[] args) {
		List<String> testString = Arrays.asList("New","Jeans","Hype","Boy");

		// JMH

		int maxValue = testString.stream()
			.mapToInt(String::length)
			.max()
			.orElse(0);
		System.out.println("maxValue = " + maxValue);
		int minValue = testString.stream()
			.mapToInt(String::length)
			.min()
			.orElse(0);
		System.out.println("minValue = " + minValue);

		List<String> list = Arrays.asList("I","am","so","cool");
		double average = list.stream()
			.mapToInt(String::length)
			.average()
			.orElse(0);
		System.out.println("average = " + average);


	}
}
