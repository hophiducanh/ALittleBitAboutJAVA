package com.tellyouiam.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PutRemoveMethod {
	public static void main(String[] args) {
		Map<String, Integer> contactMap = new HashMap<>();
		contactMap.put("A", 1);
		contactMap.put("B", 2);
		contactMap.put("C", 3);
		
		//put return previous value associate with this key.
		Integer put = contactMap.put("B", 4); //return 2
		
		//remove return previous value associate with this key.
		Integer remove = contactMap.remove("A"); // return 1.
		System.out.println("PUT..........:  " + put);
		System.out.println("REMOVE..........:  " + remove);
		
		//this used inside the hashSet to ensure unique.
		System.out.println("PUT NON_EXIST KEY: " + contactMap.put("K", 5)); //null
	}
}
