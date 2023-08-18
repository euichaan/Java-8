package me.euichan.java8.chap03;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

	private String name;
	private String id;

	public Person(final String name, final String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final Person person = (Person)o;
		return Objects.equals(name, person.name) && Objects.equals(id, person.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}
}
