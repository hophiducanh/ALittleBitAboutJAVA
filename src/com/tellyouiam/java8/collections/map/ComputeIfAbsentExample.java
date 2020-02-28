package com.tellyouiam.java8.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		map.put("key4", 4);
		
		//System.out.println(map);
		
		map.computeIfAbsent(null, v -> 1000);
		
		System.out.println("****************After computeIfAbsent");
		
		//System.out.println(map);
		
		//------------------------------------------------------------------
		Map<Integer, Integer> map1 = new HashMap<>();
		map1.put(111, 1);
		map1.put(222, 2);
		map1.put(333, 3);
		map1.put(444, 4);
		
		System.out.println(map1);
		
		map1.computeIfAbsent(null, v -> 1000);
		
		System.out.println("****************After computeIfAbsent");
		
		System.out.println(map1);
	}
}
