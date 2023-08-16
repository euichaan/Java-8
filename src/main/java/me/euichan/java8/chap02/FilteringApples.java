package me.euichan.java8.chap02;

import static me.euichan.java8.chap02.Color.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 8월 16일 실습 예정
 */
public class FilteringApples {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80, GREEN),
			new Apple(155, GREEN),
			new Apple(120, RED));

		List<Apple> greenApples = filterApples(inventory, GREEN, 0, true);
		List<Apple> heavyApples = filterApples(inventory, null, 150, false);

		// 5. 다섯 번째 시도: 익명 클래스 사용 With
		filterApples(inventory, new ApplePredicate() {
			@Override
			public boolean test(final Apple apple) {
				return false;
			}
		});

		// 6. 여섯 번째 시도: 람다 표현식 사용 With
		filterApples(inventory, apple -> false);
	}

	// 4. 네 번째 시도: 추상적 조건으로 필터링 With
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	// 1. 첫 번째 시도: 녹색 사과 필터링 With 태훈님
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> apples = new ArrayList<>();
		for (Apple apple : inventory) {
			if (GREEN == apple.getColor()) {
				apples.add(apple);
			}
		}
		return apples;
	}

	// 2. 두 번째 시도: 색을 파라미터화 With 유승님
	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple> list = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color == apple.getColor()) {
				list.add(apple);
			}
		}
		return list;
	}

	// 2. 두 번째 시도: 무게 정보 파라미터도 추가 With 도현님
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> list = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				list.add(apple);
			}
		}
		return list;
	}

	// 3. 세 번째 시도: 가능한 모든 속성으로 필터링 With
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
