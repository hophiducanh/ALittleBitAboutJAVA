package com.tellyouiam.collections.sort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 03/10/2019, Thu
 **/
public class SortByCouting {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,2,3};
		Map<Integer, Long> countMap = Arrays.stream(arr).boxed()
			.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
			.entrySet().stream()
			.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldV, newV) -> oldV, LinkedHashMap::new));

		for (Map.Entry<Integer, Long> item : countMap.entrySet()) {
			Integer key = item.getKey();
			Long value = item.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
