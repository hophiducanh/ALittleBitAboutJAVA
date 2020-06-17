package com.tellyouiam.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {
	
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}
