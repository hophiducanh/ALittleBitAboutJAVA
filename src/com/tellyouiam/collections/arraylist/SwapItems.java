package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapItems {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Collections.swap(list, 0, 1);
		list.forEach(System.out::println);
		
		System.out.println("**********************************");
		
		int x = list.set(0, list.get(1)); //return element previously at specific element
		System.out.println("X " + x);
		list.forEach(System.out::println);
	}
}
