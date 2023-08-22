package me.euichan.java8.collection;

import java.util.HashMap;
import java.util.Map;

import me.euichan.java8.chap03.Person;

public class HashMapExample {

	public static void main(String[] args) {
		// HashMap 은 우선 hashCode 를 비교하고 같을 때만 equals 를 비교한다.
		Person person1=new Person("reakwon","666666-7777777");
		Person person2=new Person("putty","123456-1234567");

		Person who=new Person("reakwon","666666-7777777");
		Map<Person, Integer> map = new HashMap<>();

		Map<String, String> stringMap = new HashMap<>(10);
		map.put(person1, 90);
		map.put(person2, 80);

		System.out.println("map includes "+who.getName()+"? "+map.containsKey(who));

		map.put(who, 70);
		map.put(null, 100);
		System.out.println(map);
	}

	public static <K, V> void printMap(Map<K, V> map) {
		map.forEach((key, value) -> System.out.println("[Key]:" + key + " [Value]:" + value));
	}
}
