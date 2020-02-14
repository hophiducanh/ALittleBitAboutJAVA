package com.tellyouiam.string.practice;

import java.util.Arrays;
import java.util.List;

public class SplitStringByDelimiter {
	public static void main(String[] args) {
		String str = "karl.brosnan@morgans.com.au";
//		String str = "karl.brosnan@morgans.com.au;mmclean@ulton.net;amanda@editbyamanda.com";
		List<String> x = Arrays.asList(str.split(";"));
		x.forEach(System.out::println);
		
	}
}
