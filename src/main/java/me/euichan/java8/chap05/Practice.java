package me.euichan.java8.chap05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		);

		// 1. 2011년에 일어난 모든 트랜잭션을 찾아서 값을 오름차순으로 정렬하시오
		List<Transaction> tr2011 = transactions.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(Comparator.comparingInt(Transaction::getValue))
			.collect(Collectors.toList());

		// 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
		List<String> cities = transactions.stream()
			.map(transaction -> transaction.getTrader().getCity())
			.distinct()
			.collect(Collectors.toList());

		transactions.stream()
			.map(Transaction::getTrader)
			.map(Trader::getCity)
			.distinct()
			.collect(Collectors.toList());

		// 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
		transactions.stream()
			.map(Transaction::getTrader)
			.filter(trader -> "Cambridge".equals(trader.getCity()))
			.distinct()
			.sorted(Comparator.comparing(Trader::getName))
			.collect(Collectors.toList());

		// 4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.
		String tradersName = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.distinct()
			.sorted()
			.collect(Collectors.joining(" "));

		String tradersName2 = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.distinct()
			.sorted()
			.reduce((n1, n2) -> n1 + " " + n2)
			.orElse(""); // 스트림에 아무 요소도 없는 상황. 초깃값이 없으므로 reduce는 합계 반환 X

		System.out.println(tradersName);
		System.out.println(tradersName2);

		// 5. 밀라노에 거래자가 있는가?
		boolean isTraderExistsInMilan = transactions.stream()
			.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));

		// 6. 케임브릿지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
		transactions.stream()
			.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
			.map(Transaction::getValue)
			.forEach(System.out::println);

		// 7. 전체 트랜잭션 중 최댓값은 얼마인가?
		transactions.stream()
			.max(Comparator.comparingInt(Transaction::getValue));
		transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer::sum);

		// 8. 전체 트랜잭션 중 최솟값은 얼마인가?
		transactions.stream()
			.min(Comparator.comparingInt(Transaction::getValue));
		transactions.stream()
			.reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
	}
}
