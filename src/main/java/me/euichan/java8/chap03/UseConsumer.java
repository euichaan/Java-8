package me.euichan.java8.chap03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {

	public static void main(String[] args) {
		forEach(
			Arrays.asList(1, 2, 3, 4, 5),
			(Integer i) -> System.out.println(i) // Consumer 의 accept 메서드를 구현하는 람다
		);
	}

	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T t : list) {
			c.accept(t);
		}
	}
}
