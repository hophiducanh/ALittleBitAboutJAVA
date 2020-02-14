package com.tellyouiam.java8.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
	public static void main(String[] args) {
		try {
			List<String> strings = new ArrayList<>();
			List<String> current = strings.stream().filter(e -> e.equalsIgnoreCase("x")).collect(Collectors.toList());
			current.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("bug");
		}
	}
}
