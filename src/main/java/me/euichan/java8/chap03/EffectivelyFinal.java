package me.euichan.java8.chap03;

import java.util.Arrays;
import java.util.List;

public class EffectivelyFinal {
	/**
	 * final
	 */
	private int instanceVariable = 0;
	private static int staticVariable = 0;

	public void someMethodWithAnonymousClass() {
		int count = 0; // effectively final. 이 스레드가 종료된다면 더이상 count 를 참조할 수 없다.
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// 람다에서는 외부 지역 변수를 복사하는 과정을 거친다.
				// 복사되는 값이 변경 가능하다면, 참조하는 변수의 최신값을 보장할 수 없어 멀티스레드 환경에서
				// 동시성 문제가 발생할 수 있다.
				// count++; 컴파일 에러
			}
		};
	}

	public void someMethodWithLambda() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Integer criteria;

		for (Integer integer : list) {
			if (integer > 2) {
				criteria = 3;
				// list.removeIf(o -> o.equals(criteria)); compile error
				// Variable used in lambda expression should be final or effectively final
			}
		}

		List<Person> personList = List.of(new Person(2), new Person(3));
		for (Person p : personList) {
			p.setId(2);
			personList.removeIf(o -> o.getId() == p.getId());
		}
	}

	public void someMethodWithStaticVariable() {
		instanceVariable = 1;
		Runnable runnable = () -> {
			instanceVariable++;
		};
	}

	public void someMethodWithInstanceVariable() {
		staticVariable = 1;
		Runnable runnable = () -> {
			staticVariable++;
		};
	}
}
