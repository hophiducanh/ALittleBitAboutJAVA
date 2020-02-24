package com.tellyouiam.string.practice;

import java.util.Arrays;
import java.util.List;

public class SplitStringByDelimiter {
	public static void main(String[] args) {
		String str = "karl.brosnan@morgans.com.au";
//		String str = "karl.brosnan@morgans.com.au;mmclean@ulton.net;amanda@editbyamanda.com";
		List<String> x = Arrays.asList(str.split(";"));
		x.forEach(System.out::println);
		
		
		String s = "Stack Over Flow Site.";//after flow is non-break char \u00A0
		System.out.println("**********Using \\s");
		Arrays.asList(s.split("\\s")).forEach(System.out::println);
		
		System.out.println("\n**********Using Unicode character");
		Arrays.asList(s.split("[\u0020\u00A0]")).forEach(System.out::println);
		
		System.out.println("\n**********Using \\p{Z}");
		Arrays.asList(s.split("\\p{Z}")).forEach(System.out::println);
		String rALl = s.replaceAll("\\p{Z}","");
		System.out.println(rALl);
		
		System.out.println("\n*****************Split with limit");
		String[] shapes = "Circle,Square,Rectangle,Hexagon".split(",", 3);
//		Arrays.asList(shapes).forEach(System.out::println);
		
		String last = s.substring(s.lastIndexOf(' ') + 1); //last occurrence is ok but can't address non-breaking character.
		System.out.println("Last Occurrence: " + last);
	}
}
