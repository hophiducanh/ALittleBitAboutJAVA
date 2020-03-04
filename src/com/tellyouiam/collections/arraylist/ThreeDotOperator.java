package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ThreeDotOperator {
	private static boolean indexExists(final List list, final Integer... indexes) {
		return Arrays.stream(indexes).allMatch(i -> (i >= 0 && i < list.size()));
	}
	
	public static void main(String[] args) {
		System.out.println(indexExists(Arrays.asList(1,2,3,4,5,6), 1, 3));
		System.out.println(indexExists(Arrays.asList(1,2,3,4,5,6), 5, 7));
		System.out.println(indexExists(Arrays.asList(1,2,3,4,5,6), - 1, 3));
	}
}
