package me.euichan.java8.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(){{
			put(1, "사과");
			put(2, "바나나");
			put(3, "포도");
		}};
		// Set<Map.Entry<Integer, String> entry
		// for (Map.Entry<Integer, String> entry : map.entrySet()) {
		// 	System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		// }

		for (Integer i : map.keySet()) {
			System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}

		System.out.println(map.get(4)); // null

		// forEach 사용
		map.forEach((key, value) -> System.out.println("[Key]:" + key + " [Value]:" + value));

		// Iterator 사용
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}

		Iterator<Integer> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key));
		}
	}
}
