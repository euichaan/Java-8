package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.util.List;
import java.util.stream.Collectors;

public class threeHighCaloricDishNames {

	public static void main(String[] args) {
		List<String> threeHighCaloricDishNames = menu.stream()
			.filter(dish -> dish.getCalories() > 300)
			.map(Dish::getName)
			.limit(3)
			.collect(Collectors.toList());

		System.out.println(threeHighCaloricDishNames); // [pork, beef, chicken]
	}
}
