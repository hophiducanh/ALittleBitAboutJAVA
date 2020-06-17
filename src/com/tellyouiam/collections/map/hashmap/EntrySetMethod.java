package com.tellyouiam.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethod {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Kamran");
		map.put(2, "Ali");
		map.put(3, "From");
		map.put(4, "Dir");
		
		//if you put to map two elements of the same key, the previous value will be replaced.
		map.put(5, "Lower");
		map.put(5, "Haha");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		System.out.println(map.entrySet()); //[1=Kamran, 2=Ali, 3=From, 4=Dir, 5=Haha]
	}
}
