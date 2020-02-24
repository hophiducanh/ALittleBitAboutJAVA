package com.tellyouiam.java8.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetLastElement {
	public static void main(String[] args) {
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");
		
		Stream<String> stream = valueList.stream();
		String lastValue = stream.reduce((first, second) -> second)
				.orElse(null);
		
		System.out.println(lastValue);
		
		Integer lastValue2 = Stream.iterate(0, i -> i + 1).reduce((first, second) -> second).orElse(null);
	}
}
