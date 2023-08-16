package me.euichan.java8.chap03;

public class LambdaEx2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName())); // Thread-0
		t.start();
	}
}
