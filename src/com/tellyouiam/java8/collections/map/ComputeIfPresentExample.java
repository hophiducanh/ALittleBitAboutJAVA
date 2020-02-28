package com.tellyouiam.java8.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputeIfPresentExample {
	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new LinkedHashMap<>();
		
		String s =
				"Lorem ipsum dolor sit amet consetetur iam nonumy sadipscing " +
						"elitr, sed diam nonumy eirmod tempor invidunt ut erat sed " +
						"labore et dolore magna dolor sit amet aliquyam erat sed diam";
		
		wordCounts.put("sed", 0);
		wordCounts.put("erat", 0);
		
		/**
		 * <pre> {@code
		 * if (map.get(key) != null) {
		 *     V oldValue = map.get(key);
		 *     V newValue = remappingFunction.apply(key, oldValue);
		 *     if (newValue != null)
		 *         map.put(key, newValue);
		 *     else
		 *         map.remove(key);
		 * }
		 * }</pre>
		 * */
		
		for (String t : s.split(" "))
		{
			wordCounts.computeIfPresent(t, (k,v) -> v + 1);
			wordCounts.computeIfPresent(t, (k,v) -> v + 1);
		}
		System.out.println(wordCounts);
	}
}
