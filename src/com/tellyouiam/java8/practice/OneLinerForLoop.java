package com.tellyouiam.java8.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OneLinerForLoop {
	public static void main(String[] args) {
		//range(int startInclusive, int endExclusive)
		//startInclusive: initial value
		//endExclusive: the exclusive upper bound
		int[] someList = IntStream.range(0, 16).map(i -> i + 1).toArray();
		System.out.println(Arrays.toString(someList));
		
		//Arrays.stream(someList).forEach(System.out::println);
	}
}
