package me.euichan.java8.chap03;

import java.util.function.Function;

public class UsingFunctionCombination {

	public static void main(String[] args) {
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		Function<Integer, Integer> h = f.compose(g); // f(g(x)), 인수로 주어진 함수를 먼저 실행한다
		int result = h.apply(1); // 3
		System.out.println(result);
	}
}
