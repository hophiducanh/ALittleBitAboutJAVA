package com.tellyouiam.collections.arraylist.converter;

import java.util.Arrays;
import java.util.List;

public class ListStringToString {
	static String join(List<String> strings, String sep) {
		final StringBuilder buf = new StringBuilder(strings.size() * 16);
		
		for(int i = 0; i < strings.size(); i++){
			
			if(i < strings.size()) {
				buf.append(sep);
			}
			
			buf.append(strings.get(i));
			
		}
		
		return buf.toString().trim();
	}
	
	public static void main(String[] args) {
		System.out.println(join(Arrays.asList("a", "b", "c", "d"), ","));
	}
}
