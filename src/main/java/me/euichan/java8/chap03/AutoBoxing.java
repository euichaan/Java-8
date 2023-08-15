package me.euichan.java8.chap03;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 300; i < 400; ++i) {
			list.add(i);
		}
		// int short byte long float double char boolean
	}
}
