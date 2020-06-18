package com.tellyouiam.regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchASCIICharacter {
	private static String getOnlyASCII(String raw) {
		//Pattern asciiPattern = Pattern.compile("\\p{ASCII}*$");
		Pattern asciiPattern = Pattern.compile("[\u0000-\u007F]*$");
		Matcher matcher = asciiPattern.matcher(raw);
		String asciiString = null;
		if (matcher.find()) {
			asciiString = matcher.group();
		}
		return asciiString;
	}
	
	public static void main(String[] args) {
		System.out.println(getOnlyASCII("��+919986774157AbcaZsf"));
	}
}
