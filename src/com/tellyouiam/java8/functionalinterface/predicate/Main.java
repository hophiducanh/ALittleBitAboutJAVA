package com.tellyouiam.java8.functionalinterface.predicate;

import java.util.function.Predicate;

//https://dzone.com/articles/be-more-functional-javas-functional-interfaces
public class Main {
	public static void main(String[] args) {
		Predicate<Integer> isEvenPredicate = new IsEvenPredicate();
		boolean is23Even = isEvenPredicate.test(23);//false
		Predicate<Integer> isEvenLambda = (number) -> number % 2 == 0;
		boolean is46Even = isEvenLambda.test(46);//true
		
		boolean result = isEvenPredicate
				.and(n -> n < 10) // second: 6 < 10 >> true
				.and(n -> n > 5) // third: 6 > 5 >> true
				.test(6); //first
		System.out.println(result); // true
	}
}
