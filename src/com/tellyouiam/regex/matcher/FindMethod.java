package com.tellyouiam.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethod {
	
	/*
	 * The find() method of Matcher Class attempts to find the next subsequence of the input sequence that find the pattern. It returns a boolean value showing the same.
	 * Return Value: This method returns a boolean value showing whether a subsequence of the input sequence find this matcher’s pattern
	 * */
	
	public static void main(String[] args) {
		// Get the regex to be checked
		String regex = "Geeks";
		
		// Create a pattern from regex
		Pattern pattern = Pattern.compile(regex);
		
		// Get the String to be matched
		String stringToBeMatched = "Geeks";
		
		// Create a matcher for the input String
		Matcher matcher = pattern.matcher(stringToBeMatched);
		
		// Get the subsequence
		// using find() method
		System.out.println(matcher.find());
		
		Matcher m = Pattern.compile("Hello").matcher("HelloHiHahaHello");
		//Matcher m1 = Pattern.compile("Hello").matcher("HelloHiHaha");
		if (m.find()) {
			System.out.println("Matcher matched!");
		}
		
		System.out.println(m.toMatchResult());
		
		int count = 0;
		// With m1, matcher m.find() return false because matcher has not been reset. (don't have another hello to match)
		// With m: it's work!
 		while (m.find()) {
			count++;
			System.out.println("Matcher matched again!: " + count);
		}
	}
}
