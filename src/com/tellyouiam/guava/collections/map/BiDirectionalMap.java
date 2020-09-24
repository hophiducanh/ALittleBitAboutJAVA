package com.tellyouiam.guava.collections.map;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class BiDirectionalMap {
	//https://stackoverflow.com/questions/10699492/bi-directional-map-in-java
	//https://www.baeldung.com/commons-collections-bidi-map
	public static void main(String[] args) {
		//Guava use BiMap
		BidiMap<String, String> map = new DualHashBidiMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		System.out.println(map.getKey("value1"));
		BidiMap<String, String> rMap = map.inverseBidiMap();
	}
}
