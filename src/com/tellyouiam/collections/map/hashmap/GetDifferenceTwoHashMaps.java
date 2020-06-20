package com.tellyouiam.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetDifferenceTwoHashMaps {
	public static Map<String, String> name = new HashMap<String, String>();
	static {
		name.put("A Million Dreams (IRE)", "29/08/2019");
		name.put("Above And Beyond", "30/09/2019");
		name.put("Al Maher x Eleebain 15", "1/05/2019");
		name.put("All About Me", "1/12/2018");
		name.put("All Sassitude", "15/05/2019");
		name.put("American Salute", "19/06/2018");
	};
	
	public static Map<String, String> horseName = new HashMap<String, String>();
	static {
		horseName.put("A Million Dreams (IRE)", "30/07/2019");
		horseName.put("Above And Beyond", "30/09/2019");
		horseName.put("Al Maher x Eleebain 15", "1/05/2019");
		horseName.put("All About Me", "1/12/2018");
		horseName.put("American Salute", "19/06/2018");
	};
	
	public static <K, V> Map<K, V> mapDiff(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right) {
		Map<K, V> difference = new HashMap<>();
		difference.putAll(left);
		difference.putAll(right);
		
		difference.entrySet().removeAll(left.size() <= right.size() ? left.entrySet() : right.entrySet());
		
		return difference;
	}
	
	private static <K, V> Map<K, V> getCommonMap(Map<? extends K, ? extends V> firstMap,
	                                             Map<? extends K, ? extends V> secondMap) {
		Map<K, V> commonMap;
		commonMap = firstMap.entrySet().stream()
				.filter(x -> secondMap.containsKey(x.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		return commonMap;
	}
	
	public static void main(String[] args) {
		Map<String, String> diff = mapDiff(name, horseName);
		System.out.println(diff);
		
		Map<String, String> commonMap = name.entrySet().stream()
				.filter(x -> horseName.containsKey(x.getKey()))
				.filter(y -> horseName.containsValue(y.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		Map<String, String> uniqueMap = name.entrySet().stream()
				.filter(x -> !horseName.containsKey(x.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		Map<String, String> comms = getCommonMap(name, horseName);
		System.out.println(commonMap);
		System.out.println(comms);
		System.out.println(uniqueMap);
	}
}
