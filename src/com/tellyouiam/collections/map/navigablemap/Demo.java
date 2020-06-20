package com.tellyouiam.collections.map.navigablemap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		NavigableMap<String, Integer> nm = new TreeMap<>();
		nm.put("1", 1);
		nm.put("2", 2);
		nm.put("3", 3);
		nm.put("4", 4);
		nm.put("5", 5);
		nm.put("6", 6);
		
		System.out.println("First key: " + nm.firstKey());
		System.out.println("Last key: " + nm.lastKey());
		System.out.println("First entry: " + nm.firstEntry());
		System.out.println("Last entry: " + nm.lastEntry());
		System.out.println("Floor Entry: " + nm.floorEntry("3"));
		System.out.println("Lower Entry: " + nm.lowerEntry("3"));
		System.out.println("Higher Entry: " + nm.higherEntry("3"));
		System.out.println("Ascending Keys: " + nm.keySet());
		System.out.println("Descending Keys: " + nm.descendingKeySet());
		List<NavigableMap<String, Integer>> list = Collections.singletonList(nm);
		
		//poll first entry
		List<NavigableMap<String, Integer>> x = list.stream().peek(NavigableMap::pollFirstEntry).collect(Collectors.toList());
		System.out.println(x);
	}
}
