package com.tellyouiam.string.escape;

import org.apache.commons.text.StringEscapeUtils;

public class CsvStringEscapeCharacter {
	public static void main(String[] args) {
		final String str = StringEscapeUtils.escapeCsv("tHIS String 'needs escaping'");
		final String s = "tHIS String 'needs escaping'";
		System.out.println(s);
		System.out.println("str = " + str);
	}
}
