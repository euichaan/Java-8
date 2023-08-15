package me.euichan.java8.chap03;

import java.util.Comparator;

public class LambdaEx {
	/**
	 * 파라미터 리스트
	 * 바디
	 * 반환 형식
	 * 발생할 수 있는 예외 리스트
	 */
	public static void main(String[] args) {
		Comparator<Apple> byWeight = new Comparator<Apple>() {
			@Override
			public int compare(final Apple o1, final Apple o2) {
				return Integer.compare(o1.getWeight(), o2.getWeight());
			}
		};

		Comparator<Apple> byWeight2 = (Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight());
	}
}
