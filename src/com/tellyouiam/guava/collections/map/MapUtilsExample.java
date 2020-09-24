package com.tellyouiam.guava.collections.map;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.TransformerUtils;

import java.util.HashMap;
import java.util.Map;

//https://www.baeldung.com/apache-commons-map-utils
public class MapUtilsExample {
	private static String[][] color2DArray = new String[][] {
			{"RED", "#FF0000"},
			{"GREEN", "#00FF00"},
			{"BLUE", "#0000FF"}
	};
	
	private static Map<String, String> colorMap;
	
	public static void main(String[] args) {
		colorMap = MapUtils.putAll(new HashMap<>(), color2DArray);
//		colorMap.forEach((k, v) -> System.out.println("key : " + k + ",Value: " + v));
		
//		MapUtils.verbosePrint(System.out, "Map Value", colorMap);
		MapUtils.debugPrint(System.out, "Map value", colorMap);
		
		String color = MapUtils.getString(colorMap, "RED");
		System.out.println(color);
		
		Map<Integer, String> intStrMap = MapUtils.lazyMap(
				new HashMap<>(),
				TransformerUtils.stringValueTransformer());
		String str = intStrMap.get(3); //3 not found -> "3"
		System.out.println(str);
		MapUtils.verbosePrint(System.out, "", intStrMap);
	}
	
}
