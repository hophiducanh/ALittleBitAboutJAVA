package com.tellyouiam.string;

public class MatchNthOccurrence {
	private static int ordinalIndexOf(String str, String substr, int n) {
		int pos = -1;
		do {
			pos = str.indexOf(substr, pos + 1);
		} while (n-- > 0 && pos != -1);
		return pos;
	}
	
	public static void main(String[] args) {
		ordinalIndexOf("abc", "b", 1);
		// StringUtils java8
		//https://programming.guide/java/nth-occurrence-in-string.html
	}
}
