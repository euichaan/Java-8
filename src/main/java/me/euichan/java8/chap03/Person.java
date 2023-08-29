package me.euichan.java8.chap03;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

	private int id;

	public Person(final int id) {
		this.id = id;
	}
}
