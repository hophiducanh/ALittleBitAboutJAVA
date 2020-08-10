package com.tellyouiam.collections.iterable;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

//https://www.baeldung.com/java-iterable-to-stream
public class IterableToStream {
	public static void main(String[] args) {
		Iterable<String> iterable = Lists.newArrayList("Testing", "Iterable", "conversion", "to", "Stream");
		List<String> result = StreamSupport.stream(iterable.spliterator(), false)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
