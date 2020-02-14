package com.tellyouiam.string.compare;

import java.util.regex.Pattern;

public class ContainsIgnoreCase {
	public static void main(String[] args) {
		String wantedStr = "he";
		CharSequence source = "hello";
		boolean isMatched = Pattern.compile(Pattern.quote(wantedStr), Pattern.CASE_INSENSITIVE).matcher(source).find();
		
		if (isMatched)
			System.out.println("IsMatched");
		
	}
}
