package me.euichan.java8.chap05;

import static me.euichan.java8.chap04.Dish.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import me.euichan.java8.chap04.Dish;
import me.euichan.java8.chap04.Type;

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("a", "b", "A", "B");
		str.sort((s1, s2) -> s1.compareToIgnoreCase(s2)); // (T, T) -> R
		str.sort(String::compareToIgnoreCase);

		List<String> collect = menu.stream()
			.filter(dish -> dish.getCalories() < 400)
			.sorted(Comparator.comparingInt(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());

		// 인스턴스 메서드 참조. 인스턴스가 있어야함. 그렇다면 (Dish dish) -> dish.getName();
		// Dish::getName ClassName::instanceMethod
		Dish dish = new Dish("pork", false, 800, Type.MEAT);
		Supplier<String> getName = dish::getName; // () -> T

		ToIntFunction<String> stringToInt = Integer::parseInt;
		BiPredicate<List<String>, String> contains = List::contains;

		Function<Integer, Melon> function = (weight) -> new Melon(weight);
		Melon melon = function.apply(100);
	}
}
