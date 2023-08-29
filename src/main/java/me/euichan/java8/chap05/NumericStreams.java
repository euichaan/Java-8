package me.euichan.java8.chap05;

import static me.euichan.java8.chap04.Dish.*;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import me.euichan.java8.chap04.Dish;

public class NumericStreams {

	public static void main(String[] args) {
		//int calories = menu.stream()
		//	.map(Dish::getCalories)
		//	.reduce(0, Integer::sum); // Integer -> int

		// 박싱 비용을 피할 수 있도록 IntStream, DoubleStream, LongStream을 제공한다.
		// 각각의 인터페이스는 sum, max 같이 자주 사용하는 숫자 관련 리듀싱 연산 수행 메서드를 제공한다.
		// mapToInt, mapToDouble, mapToLong -> 특화된 스트림 반환
		int calories = menu.stream()
			.mapToInt(Dish::getCalories)
			.sum();

		Stream<Integer> stream = menu.stream()
			.mapToInt(Dish::getCalories)
			.boxed(); // 객체 스트림으로 복원하기

		// 스트림에 요소가 없는 상황과 실제 최댓값이 0인 상황을 구분하기 위해 Optional 사용
		OptionalInt maxCalories = menu.stream()
			.mapToInt(Dish::getCalories)
			.max();

		IntStream evenNumbers = IntStream.rangeClosed(1, 100)
			.filter(n -> (n & 2) == 0);
		System.out.println(evenNumbers.count());
	}
}
