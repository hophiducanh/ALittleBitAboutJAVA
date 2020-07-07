package com.tellyouiam.collections.arraylist.failfast.failsafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeReflectOriginal {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		
		Iterator it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
			
			// This will reflect in iterator.
			// Hence, it has not created separate copy
			map.put("SEVEN", 7);
		}
		System.out.println("map = " + map);
	}
}
