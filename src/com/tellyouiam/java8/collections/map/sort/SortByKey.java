package com.tellyouiam.java8.collections.map.sort;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKey {
	public static void main(String[] args) {
		List<Map.Entry<String, String>> ls = new ArrayList<>();
		ls.add(new AbstractMap.SimpleImmutableEntry<>("1", "hi"));
		ls.add(new AbstractMap.SimpleImmutableEntry<>("2", "ha"));
		ls.add(new AbstractMap.SimpleImmutableEntry<>("-1", "huhuh"));
		
//		final List<Map.Entry<String, String>> collect = ls.stream()
//				.sorted(Map.Entry.comparingByKey())
//				.collect(Collectors.toList());
		
		final Comparator<Map.Entry<String, String>> comparing = Comparator.comparing(Map.Entry::getKey);
		ls.sort(comparing);
		ls.forEach(i -> {
			System.out.println("Key: " + i.getKey() + ",Value: " + i.getValue());
		});
	}
}
