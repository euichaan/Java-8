package me.euichan.java8.chap03;

import java.util.List;

public class Tester {

	private int instanceVariable = 0;
	private static int staticVariable = 0;

	public void someMethodWithStaticVariable() {
		staticVariable = 1;
		Runnable runnable = () -> {
			staticVariable++;
		};
	}

	public void someMethodWithInstanceVariable() {
		instanceVariable = 1;
		Runnable runnable = () -> {
			instanceVariable++;
		};
	}

	public static void main(String[] args) {
		List<Person> personList = List.of(new Person(2), new Person(3));
		for (Person p : personList) {
			p.setId(2);
			personList.removeIf(o -> o.getId() == p.getId());
		}
	}
}
