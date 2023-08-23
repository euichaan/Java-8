package me.euichan.java8.chap03;

import java.util.function.Predicate;

public class UsingPredicateCombination {

	public static void main(String[] args) {
		Predicate<Apple> redApple = (Apple a) -> Color.RED == a.getColor();
		Predicate<Apple> notRedApple = redApple.negate();

		Predicate<Apple> redAndHeavyApple =
			redApple.and(a -> a.getWeight() > 150);

		//Predicate<Apple> redAndHeavyApple =
		// 			redApple.and((Apple a) -> a.getWeight() > 150);

		Predicate<Apple> redAndHeavyAppleOrGreen = redApple.and(apple -> apple.getWeight() > 150)
			.or(apple -> Color.GREEN == apple.getColor());
	}
}
