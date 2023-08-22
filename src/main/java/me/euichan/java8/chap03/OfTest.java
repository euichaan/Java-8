package me.euichan.java8.chap03;

import java.util.List;

public class OfTest {

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5);
		System.out.println(integers.getClass().getName()); // java.util.ImmutableCollections$ListN

		// integers.add(6); // UnsupportedOperationException
		// integers.remove(0); // UnsupportedOperationException
		// integers.clear(); // UnsupportedOperationException
		// integers.set(0, 0); // UnsupportedOperationException

		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		t.start();

		integers.removeIf(i -> i % 2 == 0);
	}
}
