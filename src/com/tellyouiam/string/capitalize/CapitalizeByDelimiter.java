package com.tellyouiam.string.capitalize;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class CapitalizeByDelimiter {
	private static Set<Integer> generateDelimiterSet(final char[] delimiters) {
		final Set<Integer> delimiterHashSet = new HashSet<>();
		if (delimiters == null || delimiters.length == 0) {
			if (delimiters == null) {
				delimiterHashSet.add(Character.codePointAt(new char[] {' '}, 0));
			}
			
			return delimiterHashSet;
		}
		
		for (int index = 0; index < delimiters.length; index++) {
			delimiterHashSet.add(Character.codePointAt(delimiters, index));
		}
		return delimiterHashSet;
	}
	
	private static String capitalize(final String str, final char... delimiters) {
		if (StringUtils.isEmpty(str)) {
			return str;
		}
		final Set<Integer> delimiterSet = generateDelimiterSet(delimiters);
		final int strLen = str.length();
		final int[] newCodePoints = new int[strLen];
		int outOffset = 0;
		
		boolean capitalizeNext = true;
		for (int index = 0; index < strLen;) {
			final int codePoint = str.codePointAt(index);
			
			if (delimiterSet.contains(codePoint)) {
				capitalizeNext = true;
				newCodePoints[outOffset++] = codePoint;
				index += Character.charCount(codePoint);
			} else if (capitalizeNext) {
				final int titleCaseCodePoint = Character.toTitleCase(codePoint);
				newCodePoints[outOffset++] = titleCaseCodePoint;
				index += Character.charCount(titleCaseCodePoint);
				capitalizeNext = false;
			} else {
				newCodePoints[outOffset++] = codePoint;
				index += Character.charCount(codePoint);
			}
		}
		return new String(newCodePoints, 0, outOffset);
	}
	
	public static void main(String[] args) {
		//WordUtils.capitalize()
		String str = capitalize("i aM.fine", '.');
		System.out.println(str);
	}
}
