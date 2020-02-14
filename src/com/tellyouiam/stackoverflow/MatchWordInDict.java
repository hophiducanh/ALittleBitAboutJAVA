package com.tellyouiam.stackoverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Ho Anh
 * @since : 09/02/2020, Sun
 **/
public class MatchWordInDict {
	public static void main(String[] args) {
		List<String> dict = new ArrayList<>();
		dict.add("home");
		dict.add("house");
		dict.add("dormitory");
		System.out.println(rep(dict, "homer housers pencil air"));
	}
	
	public static String rep(List<String> dict, String sentence) {
		List<String> list;
		String[] s = sentence.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			final int j = i;
			System.out.println(s[i]);
			list = dict.stream().filter(str -> str.contains(s[j])).collect(Collectors.toList());
			if (!list.isEmpty()) {
				s[i] = list.get(0);
			}
			list.clear();
		}
		
		return String.join(" ", s);
		
	}
}
