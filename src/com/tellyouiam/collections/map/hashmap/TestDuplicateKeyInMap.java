package com.tellyouiam.collections.map.hashmap;

import com.tellyouiam.java8.anymatch.MergedTrainerHorse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Ho Anh
 * @since : 19/09/2019, Thu
 **/
public class TestDuplicateKeyInMap {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> list = Arrays.asList("Ho", "Anh");
		List<String> list1 = Arrays.asList("Nam", "Lan");
		map.put("key1", list1);
//		map.get("key1").add("value1");
//		map.get("key1").add("value2");

		map.put("key1", list);

		map.forEach((key, value) -> System.out.println(key + ":" + value));
		String value = "Anh Duc";
		System.out.println("**************************");
		System.out.println(value.length());
		if (value.startsWith("Ducc", 4)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


		Map<String, Object> contactMap = new HashMap<>();
		contactMap.put("A", new MergedTrainerHorse(1, "Horse"));
		System.out.println(contactMap.put("A", new MergedTrainerHorse(1, "Horse")));
		contactMap.put("B", new MergedTrainerHorse(2, "Mammal"));
		contactMap.put("C", new MergedTrainerHorse(3, "Dinosaurs"));

//		Map<String, Name> nameMap = (Map<String, Name>) contactMap.get("A");
		contactMap.forEach((k,v) -> System.out.println(k + ":" + v));
	}
}
