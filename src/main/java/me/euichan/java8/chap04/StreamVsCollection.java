package me.euichan.java8.chap04;

import static me.euichan.java8.chap04.Dish.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamVsCollection {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Iterator<Dish> iterator = menu.iterator();
		while (iterator.hasNext()) {
			Dish dish = iterator.next();
			names.add(dish.getName());
		}
	}
}
