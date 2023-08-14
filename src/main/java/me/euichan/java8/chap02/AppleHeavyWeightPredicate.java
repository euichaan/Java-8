package me.euichan.java8.chap02;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(final Apple apple) {
		return apple.getWeight() > 150;
	}
}
