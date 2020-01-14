package com.tellyouiam.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethod {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kamran");
		map.put(2, "Ali");
		map.put(3, "From");
		map.put(4, "Dir");
		map.put(5, "Lower");
		map.put(5, "Haha");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}
}
