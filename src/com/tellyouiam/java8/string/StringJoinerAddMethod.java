package com.tellyouiam.java8.string;

import java.util.StringJoiner;

public class StringJoinerAddMethod {
	
	public static void main(String[] args) {
		String SUFFIX = "]";
		String PREFIX = "[";
		StringJoiner joiner = new StringJoiner(",", PREFIX, SUFFIX);
		joiner.add("Blue").add("Yellow").add("Brown");
		System.out.println(joiner.toString());
	}
}
