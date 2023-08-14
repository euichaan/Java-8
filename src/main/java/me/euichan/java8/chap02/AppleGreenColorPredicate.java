package me.euichan.java8.chap02;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(final Apple apple) {
		return Color.GREEN == apple.getColor();
	}
}
