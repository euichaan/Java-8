package me.euichan.java8.enumcomparison;

import static org.junit.jupiter.api.DisplayNameGenerator.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(ReplaceUnderscores.class)
class EnumTest {

	Ranking ranking = null;


	@Test
	void enum_비교시_equals는_NPE가_발생할_수_있다() {
		// System.out.println(ranking.equals(Ranking.WINNER)); // NPE 발생
		System.out.println(Ranking.WINNER.equals(ranking));
	}

	@Test
	void enum_비교시_equality_operator는_NPE가_발생하지_않는다() {
		System.out.println(ranking == Ranking.WINNER); // false. NPE 발생하지 않음
	}

	@Test
	void enum_비교시_equals는_타입이맞지않아도_컴파일된다() {
		System.out.println(ranking.equals(Rank.FIRST));
	}

	@Test
	void enum_비교시_equality_operator는_컴파일에러가_발생한다() {
		// System.out.println(ranking == Rank.FIRST);
	}

}
