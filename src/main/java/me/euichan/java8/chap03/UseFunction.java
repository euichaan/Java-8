package me.euichan.java8.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UseFunction {

	// String 리스트를 인수로 받아 각 String의 길이를 포함하는 Integer 리스트로 변환하는 map 메서드
	public static void main(String[] args) {
		List<Integer> stringLength = map(
			Arrays.asList("lambdas", "in", "action"),
			(String s) -> s.length()
		);
		System.out.println(stringLength); // [7, 2, 6]
	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(f.apply(t));
		}
		return result;
	}
}
