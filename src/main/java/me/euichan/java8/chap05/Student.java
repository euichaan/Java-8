package me.euichan.java8.chap05;

import java.util.function.Function;
import java.util.function.Supplier;

public class Student {

	private static int age = 20;
	private String name;

	public String getName() {
		return name;
	}

	public static int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// 1. 정적 메서드 참조
		// (args) -> ClassName.staticMethod(args)
		// ClassName::staticMethod
		Supplier<Integer> lambdaV1 = () -> Student.getAge();
		Supplier<Integer> methodReferenceV1 = Student::getAge;

		// 3. 기존 객체의 인스턴스 메서드
		// (args) -> expr.instanceMethod(args)
		// expr::instanceMethod
		Student student = new Student();
		Supplier<String> lambdaV3 = () -> student.getName();
		Supplier<String> methodReferenceV3 = student::getName;

		// 2. 다양한 형식의 인스턴스 메서드 참조
		Function<Student, String> lambdaV2 = (Student std) -> std.getName();
		Function<Student, String> methodReferenceV2 = Student::getName;
	}
}
