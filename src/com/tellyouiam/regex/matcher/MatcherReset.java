package com.tellyouiam.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReset {
	//https://www.javaworld.com/article/3195301/java-101-regular-expressions-in-java-part-2.html?page=2
	public static void main(String[] args)
	{
		// Get the regex to be checked
		String regex = "Geeks";
		
		// Create a pattern from regex
		Pattern pattern = Pattern.compile(regex);
		
		// Get the String to be matched
		String stringToBeMatched = "GeeksForGeeks";
		
		// Create a matcher for the input String
		Matcher matcher = pattern.matcher(stringToBeMatched);
		
		// Get the current matcher state
		System.out.println("Current Matcher: " + matcher.toMatchResult());
		if (matcher.find()) {
			System.out.println("Matcher matched!");
		}
		
		while (matcher.find()) {
			System.out.println("Matcher matched again!");
		}
		
		matcher.reset();
		System.out.println("Current Matcher after Reset(): " + matcher.toMatchResult());
		
		// Reset the Matcher using reset() method
		String newStringToBeMatched = "GeeksGeeksGeeks";
		matcher.reset(newStringToBeMatched);
		
		// Get the current matcher state
		System.out.println("Current Matcher after Reset(param): " + matcher.toMatchResult());
	}
}
