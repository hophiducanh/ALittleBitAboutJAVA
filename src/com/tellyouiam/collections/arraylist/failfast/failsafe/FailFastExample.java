package com.tellyouiam.collections.arraylist.failfast.failsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/fail-fast-fail-safe-iterators-java/
 * https://toando.coffee/fail-safe-va-fail-fast/
 * */
public class FailFastExample {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");
		
		Iterator iterator = cityCode.keySet().iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			//structural modification while iterating
			cityCode.put("VietNam", "Hanoi");
		}
	}
}
