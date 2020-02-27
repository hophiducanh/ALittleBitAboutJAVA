package com.tellyouiam.java8.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DifferenceBetweenTwoMap {
	private static Map<String, String> mapA = new HashMap<>();
	static {
		mapA.put("A", "A");
		mapA.put("B", "B");
		mapA.put("C", "C");
		mapA.put("D", "D");
		mapA.put("E", "E");
	};
	
	private static Map<String, String> mapB = new HashMap<>();
	static {
		mapA.put("A", "B");
		mapA.put("B", "B");
		mapA.put("C", "E");
		mapA.put("D", "D");
		mapA.put("E", "K");
	};
	
	private static <K, V> Map<K, V> getDiffMap(Map<? extends K, ? extends V> firstMap,
	                                          Map<? extends K, ? extends V> secondMap, boolean isDiffKey) {
		Map<K, V> diffMap;
		diffMap = firstMap.entrySet().stream()
				.filter(isDiffKey ? x -> !secondMap.containsKey(x.getKey()) : x -> secondMap.containsKey(x.getKey()))
				.filter(y -> !secondMap.containsValue(y.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		return diffMap;
	}
	
	public static void main(String[] args) {
		Map<String, String> result = new HashMap<>();
		result = getDiffMap(mapA, mapB, true);
		System.out.println(result.entrySet());
	}
}
