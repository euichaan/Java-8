package me.euichan.java8.chap03;

public class RunnableEx {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Hello World 1"); // 람다 사용
		Runnable r2 = new Runnable() { // 익명 클래스 사용
			@Override
			public void run() {
				System.out.println("Hello World 2");
			}
		};

		process(r1);
		process(r2);
		process(() -> System.out.println("Hello World 3")); // 직접 전달된 람다 표현식 사용

		process(() -> System.out.println("This is awesome"));
		process(() -> { System.out.println("This is awesome");});
	}

	public static void process(Runnable r) {
		r.run();
	}
}
