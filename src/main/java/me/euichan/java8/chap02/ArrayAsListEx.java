package me.euichan.java8.chap02;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		// 리스트를 만드는 팩터리 메서드 1번 Arrays.asList
		final List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println(list.getClass().getName()); // java.util.Arrays$ArrayList
		// add remove
		// list.add(10); // UnsupportedOperationException

		// 리스트를 만드는 팩터리 메서드 2번 List.of
		List<Integer> list2 = List.of(1, 2, 3);
		System.out.println(list2.getClass().getName()); // java.util.ImmutableCollections$ListN
	}
}
