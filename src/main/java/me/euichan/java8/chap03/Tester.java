package me.euichan.java8.chap03;

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
}
