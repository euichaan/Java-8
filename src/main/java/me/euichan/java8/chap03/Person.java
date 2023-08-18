package me.euichan.java8.chap03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Person {

	private int id;

	public Person(final int id) {
		this.id = id;
	}
}
