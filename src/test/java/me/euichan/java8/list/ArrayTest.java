package me.euichan.java8.list;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTest {

	List<String> friends;

	@BeforeEach
	void setUp() {
		friends = Arrays.asList("Raphael", "Olivia", "Thibaut");
	}

	@Test
	void Arrays_asList로_만들어진_리스트는_요소의_추가가_불가능하다() {
		assertThatThrownBy(() -> friends.add("Chih-Chun"))
			.isInstanceOf(UnsupportedOperationException.class);
	}

	@Test
	void Arrays_asList로_만들어진_리스트는_요소의_삭제가_불가능하다() {
		assertThatThrownBy(() -> friends.remove(0))
			.isInstanceOf(UnsupportedOperationException.class);
	}

	@Test
	void Arrays_asList로_만들어진_리스트는_요소의_갱신은_가능하다() {
		assertThatNoException()
			.isThrownBy(() -> friends.set(0, "Richard"));
	}
}
