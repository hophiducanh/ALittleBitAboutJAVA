package com.tellyouiam.string.stripandtrim;

public class RemoveLineFeedAtEndString {
	public static void main(String[] args) {
		String myString = "\nLogbasex\n";
		System.out.println(myString);
		myString = org.apache.commons.lang3.StringUtils.strip(myString, "\n");
		System.out.println(myString);
	}
}
