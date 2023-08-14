package me.euichan.java8.chap02;

import static me.euichan.java8.chap02.Color.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilteringApples {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, GREEN),
			new Apple(155, GREEN),
			new Apple(120, RED));

		List<Apple> greenApples = filterApples(inventory, GREEN, 0, true);
		List<Apple> heavyApples = filterApples(inventory, null, 150, false);
	}

	// 1. 첫 번째 시도: 녹색 사과 필터링
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		return Collections.emptyList();
	}

	// 2. 두 번째 시도: 색을 파라미터화
	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		return Collections.emptyList();
	}

	// 2. 두 번째 시도: 무게 정보 파라미터도 추가
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		return Collections.emptyList();
	}

	// 3. 세 번째 시도: 가능한 모든 속성으로 필터링
	public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ((flag && color == apple.getColor()) || (!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
		}
		return result;
	}
}
