package me.euichan.java8.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsePredicate {

	public static void main(String[] args) {
		// 1. Predicate<T> T -> boolean
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(new ArrayList<>(), nonEmptyStringPredicate);
		List<String> nonEmptyWithLambda = filter(new ArrayList<>(), (String s) -> !s.isEmpty());

		Predicate<Apple> redApple = (Apple apple) -> Color.RED == apple.getColor();
		Predicate<Apple> redAndHeavyApple = redApple.and((Apple apple) -> apple.getWeight() > 150);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				results.add(t);
			}
		}
		return results;
	}
}
