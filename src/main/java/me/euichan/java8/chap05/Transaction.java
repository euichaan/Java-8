package me.euichan.java8.chap05;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Transaction {
	public final Trader trader;
	private final int year;
	private final int value;

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 31 + (trader == null ? 0 : trader.hashCode());
		hash = hash * 31 + year;
		hash = hash * 31 + value;
		return hash;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof Transaction)) {
			return false;
		}
		Transaction o = (Transaction) other;
		boolean eq = Objects.equals(trader,  o.getTrader());
		eq = eq && year == o.getYear();
		eq = eq && value == o.getValue();
		return eq;
	}

	@SuppressWarnings("boxing")
	@Override
	public String toString() {
		return String.format("{%s, year: %d, value: %d}", trader, year, value);
	}
}
