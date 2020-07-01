package com.tellyouiam.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

//https://www.baeldung.com/java-linked-hashmap
//https://stackoverflow.com/questions/35838739/linkedhashmap-ordering
/**
 * Both your get and put calls constitute an "access" from least-recently accessed to most-recently (access-order).
 * */
public class Ordering {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>(16, .75f, true);
		map.put(1, "Ajay");
		map.put(2, "Vijay");
		map.put(3, "Kiran");
		map.put(4, "Faiz");
		
		for(String value:map.values()){
			System.out.println(value);
		}
		
		String val = map.get(3);
		map.put(2, "Ravi");
		System.out.println("After changes...");
		for(String value : map.values()){
			System.out.println(value);
		}
	}
}
