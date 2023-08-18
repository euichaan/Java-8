package me.euichan.java8.chap03;

import java.util.Arrays;
import java.util.List;

public class EffectivelyFinal {

	// Anonymous Class
	public void someMethod() {
		int count = 0;
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// count++; 컴파일 에러
			}
		};
	}

	// Lambda Expressions
	public void someMethod1() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Integer criteria;

		for (Integer integer : list) {
			if (integer > 2) {
				criteria = 3;

				// list.removeIf(o -> o.equals(criteria)); 컴파일 에러
			}
		}
	}
}
