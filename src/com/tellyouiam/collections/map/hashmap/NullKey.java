package com.tellyouiam.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NullKey {
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<>();
		map.put(null, 1);
		map.put(null, 2);
		map.put(null, 3);
		map.put(null, -1);
		//null put in bucket 0. map.put the same key >> get key return lasted entry was putting.
		System.out.println(map.get(null));
		
	}
}
