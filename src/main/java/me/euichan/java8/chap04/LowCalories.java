package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LowCalories {
	/**
	 * 1. 저칼로리의 요리명을 반환하고,
	 * 2. 칼로리를 기준으로 요리를 정렬한다.
	 */
	public static void main(String[] args) {
		/**
		 * Java7
 		 */
		List<Dish> lowCaloricDishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			@Override
			public int compare(final Dish dish1, final Dish dish2) {
				return Integer.compare(dish1.getCalories(), dish2.getCalories());
			}
		});
		List<String> lowCaloricDishesNameWithJava7 = new ArrayList<>();
		for (Dish dish : lowCaloricDishes) {
			lowCaloricDishesNameWithJava7.add(dish.getName());
		}

		/**
		 * Java8
		 */
		List<String> lowCaloricDishesName = menu.stream()
			.filter(dish -> dish.getCalories() < 400)
			.sorted(Comparator.comparing(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());
	}
}
