package com.tellyouiam.guava.charmatcher;

import com.google.common.base.CharMatcher;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		String input = "H*el.lo,}12";
		final CharMatcher charMatcher = CharMatcher.javaLetterOrDigit();
		final String value = charMatcher.retainFrom(input);
		System.out.println(value);
	}
}
