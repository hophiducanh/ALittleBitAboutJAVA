package com.tellyouiam.regex.practice;

import org.apache.commons.lang3.StringUtils;

public class MatchEmptyString {
	public static void main(String[] args) {
		String pattern = "(?![\\s\\S])";
		String e = StringUtils.EMPTY;
		
		if (e.matches(pattern)) {
			System.out.println("Match empty String!");
		}
	}
}
