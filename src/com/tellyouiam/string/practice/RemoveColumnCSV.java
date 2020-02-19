package com.tellyouiam.string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveColumnCSV {
//	public static List<Integer> isBlank(String str) {
//		List<Integer> indexes = new ArrayList<>();
//		for (int i = 0; i < str.length(); i++) {
//			if ((!Character.isWhitespace(str.charAt(i)))) {
//				indexes.add(i);
//			}
//		}
//		return indexes;
//	}
	
	public static List<String> isBlank(String str) {
		String[] arr = str.split(",");
		
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		List<Integer> indexes = new ArrayList<>();
//		list.removeIf(String::isEmpty);
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			if (string.isEmpty()) {
				// Remove the current element from the iterator and the list.
				iterator.remove();
			}
		}
		System.out.println(indexes);
		return list;
	}
	
	public static void main(String[] args) {
//		String text = "anh,lan,,ho";
//		List<String> myList = new ArrayList<String>(Arrays.asList(text.split(",")));
//		List<String> old = removeTheElement(myList,3);
//		myList.removeAll(old);
//		String str = Arrays.toString(myList.toArray());
//		System.out.println(str);
		
//		String string = "Wyendra,100.00%,,,,,31/12/2018,,,,Proven Thoroughbreds,,,,,,,,,,,,,PO Box N72       GROVENOR " +
//				"PLACE NSW 1220 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,0418281447,,,,,,,,ajwalter@bigpond.com; " +
//				"tom@proventhoroughbreds.com.au,,,,,,,,,,,,,N,\n";
//		List<String> remainStr = isBlank(string);
//		String result = String.join(",", remainStr);
//		StringBuilder sb = new StringBuilder(result);
//		// Prints out "blah"
//		System.out.println(sb.toString());
	}
}
