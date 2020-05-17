package com.tellyouiam.java8.practice;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumber {
	
	private static boolean isPrime(long n) {
		return n > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
	}
	
	private static long countPrimes(int max) {
		return IntStream.rangeClosed(1, max).parallel().filter(PrimeNumber::isPrime).count();
	}
	public static void main(String[] args) {
		System.out.println(countPrimes(100));
	}
}
