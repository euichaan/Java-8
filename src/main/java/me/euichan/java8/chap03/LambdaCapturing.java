package me.euichan.java8.chap03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class LambdaCapturing {

	ExecutorService executorService = Executors.newFixedThreadPool(1);

	// 1. 외부 인스턴스 변수 참조
	private int count = 0;

	public void someMethod() {
		Runnable runnable = () -> System.out.println("count: " + count);
	}

	// 2. 외부 지역 변수 참조
	public void someMethod1() {
		int count = 0;
		Runnable runnable = () -> System.out.println("count: " + count);
	}

	// Non-Capturing Lambda
	public static void main(String[] args) {
		Runnable runnable = () -> {
			String msg = "Hello";
			System.out.println(msg);
		};
		Function<Integer, Integer> func = (param) -> 5 * param;
		func.apply(5);
	}
}
