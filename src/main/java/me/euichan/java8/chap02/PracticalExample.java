package me.euichan.java8.chap02;

import static me.euichan.java8.chap02.Color.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PracticalExample {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, GREEN),
			new Apple(155, GREEN),
			new Apple(120, RED));
		// 1. Comparator 로 정렬하기
		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(final Apple o1, final Apple o2) {
				return Integer.compare(o1.getWeight(), o2.getWeight());
			}
		});
		// 2. 람다 표현식
		inventory.sort((Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight()));

		// 3. 메서드 참조
		inventory.sort(Comparator.comparingInt(Apple::getWeight));

		// 4. Runnable로 코드 블록 실행하기
		Thread t = new Thread(() -> System.out.println("Hello world"));

		// 5. Callable을 결과로 반환하기
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(() -> Thread.currentThread().getName()); // () -> V
	}
}
