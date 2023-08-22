package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.util.List;
import java.util.stream.Collectors;

public class threeHighCaloricDishNames {

	public static void main(String[] args) {
		List<String> threeHighCaloricDishNames = menu.stream()
			.filter(dish -> dish.getCalories() > 300) // 중간 연산
			.map(Dish::getName) // 중간 연산
			.limit(3) // 중간 연산 intermediate operation
			.collect(Collectors.toList()); // 최종(종단) 연산 terminal operation

		System.out.println(threeHighCaloricDishNames); // [pork, beef, chicken]
	}
}
