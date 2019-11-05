package com.tellyouiam.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Capturing group (pattern) creates a group that has capturing property.
* A related one that you might often see (and use) is (?:pattern), which creates a group without capturing property, hence named non-capturing group.
* https://stackoverflow.com/questions/16517689/java-regex-capturing-groups-indexes
* */

public class MatcherGroup {
	public static void main(String[] args) {
		Matcher matcher;
		String typeName = "ABC:xxxxx;";
		Pattern pattern4 = Pattern.compile("(.*):"); //Group 0 >> ("(.*):"); Group 1 >> (.*)
		//Ở trên ví dụ như compile(regex) thì group(0) là (regex). Take care
		matcher = pattern4.matcher(typeName);
		
		String nameStr = "";
		if (matcher.find()) {
			nameStr = matcher.group(1); //Group 0 >> "ABC:", Group 1 >> "ABC"
		}
		System.out.println(nameStr);
	}
}
