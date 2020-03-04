package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class VerifyIndexArraylist {
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1,2,3,9,5,6);
		int initialIndex = 0;
		int maxIndex = ar.size() -1;
		
		//find index of max value
		int index = IntStream.range(0, ar.size()).boxed()
				.max(Comparator.comparing(ar::get)).orElse(-1);
		
		System.out.println(index);
		System.out.println(maxIndex);
	}
}
