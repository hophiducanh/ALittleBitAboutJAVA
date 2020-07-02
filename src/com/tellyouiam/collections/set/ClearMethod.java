package com.tellyouiam.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClearMethod {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
		set.forEach(System.out::println);
		set.clear();
		System.out.println("CLEAR********");
		set.forEach(System.out::println);
	}
}
