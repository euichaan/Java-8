package me.euichan.java8.effectivejava;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {

	private final String name;

	public Car(final String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Objects.equals(name, car.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public static void main(String[] args) {
		Car car = new Car("car");
		Car car1 = new Car("car");
		System.out.println(car.equals(car1)); // 논리적으로 같은 객체로 판단된다.

		Set<Car> cars = new HashSet<>();
		cars.add(new Car("foo"));
		cars.add(new Car("foo"));
		System.out.println(cars.size()); // 1

		// 1. hashCode() 리턴 값이 일치하고
		// 2. equals 메서드의 리턴 값이 true여야 논리적으로 같은 객체라고 판단
	}
}
