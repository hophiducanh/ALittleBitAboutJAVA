package com.tellyouiam.guava.splitter;

import com.google.common.base.Splitter;

import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public class Example {
	
	public static void main(String[] args) {
		String commaSeparated = "item1 , item2 , item3";
		List<String> list = Splitter.on(',').trimResults().omitEmptyStrings().splitToList(commaSeparated);
		list.forEach(System.out::println);
	}
}
