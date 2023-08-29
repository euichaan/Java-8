package me.euichan.java8.chap04;

import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface CustomPredicate<T> {

	boolean test(T t);

	default Predicate<T> and(Predicate<? super T> other) {
		// <? super T> ? = unknown type T 거나 T의 상위 클래스, 하한 제한
		// <? extends T> 상한 제한
		// PECS(Producer Extends Consumer Super) 원칙
		Objects.requireNonNull(other);
		return (t) -> test(t) && other.test(t);
	}

	default Predicate<T> or(Predicate<? super T> other) {
		Objects.requireNonNull(other);
		return (t) -> test(t) || other.test(t);
	}
}
