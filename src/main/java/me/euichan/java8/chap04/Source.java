package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Source {

	public static void main(String[] args) {
		// 1. 컬렉션
		List<String> lowCaloricDishesName = menu.stream()
			.filter(dish -> dish.getCalories() < 400)
			.sorted(Comparator.comparing(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());

		// 2. 배열
		Integer[] numbers = {1, 2, 3, 4, 5};
		Arrays.stream(numbers)
			.forEach(System.out::println);

		// 3. I/O 자원
		String filePath = "src/main/java/me/euichan/java8/chap04/Source.java";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			reader.lines() // return Stream
				.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
