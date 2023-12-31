package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation { // 중간 연산

	public static void main(String[] args) {
		List<String> names = menu.stream()
			.filter(dish -> {
				System.out.println("filtering = " + dish.getName());
				return dish.getCalories() > 300;
			})
			.map(dish -> {
				System.out.println("mapping:" + dish.getName());
				return dish.getName();
			})
			.limit(3) //쇼트 서킷
			.collect(Collectors.toList());
		System.out.println(names);
	}
}
