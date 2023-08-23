package me.euichan.java8.chap03;

import static me.euichan.java8.chap03.Color.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingComparatorCombination {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, GREEN),
			new Apple(155, GREEN),
			new Apple(120, RED));

		Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
		// 역정렬
		inventory.sort(Comparator.comparing(Apple::getWeight).reversed());

		inventory.sort(Comparator.comparing(Apple::getWeight)
			.reversed()
			.thenComparing(Apple::getColor));
	}
}
