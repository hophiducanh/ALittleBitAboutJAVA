package com.tellyouiam.regex.practice;

import org.apache.commons.lang3.StringUtils;

public class MatchEmptyString {
	public static void main(String[] args) {
		
		// ?! (Negative look ahead): Specifies a group that can not match after the main expression (if it matches, the result is discarded).
		// \s: Matches any whitespace character (spaces, tabs, line breaks).
		// \S: Matches any character that is not a whitespace character (spaces, tabs, line breaks).
		String pattern = "(?![\\s\\S])";
		String e = StringUtils.EMPTY;
		
		if (e.matches(pattern)) {
			System.out.println("Match empty String!");
		}
	}
}
