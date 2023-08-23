package me.euichan.java8.chap03;

import java.util.function.Function;

public class Letter {

	public static String addHeader(final String text) {
		return "From Raoul, Mario and Alan: " + text;
	}

	public static String addFooter(final String text) {
		return text + " Kind regards";
	}

	public static String checkSpelling(final String text) {
		return text.replaceAll("labda", "lambda");
	}

	public static void main(String[] args) {
		Function<String, String> addHeader = Letter::addHeader; // 헤더를 추가한 다음에
		Function<String, String> transformationPipeline =
			addHeader.andThen(Letter::checkSpelling) // 철자 검사를 하고
				     .andThen(Letter::addFooter); // 마지막에 푸터를 추가할 수 있다.
	}
}
