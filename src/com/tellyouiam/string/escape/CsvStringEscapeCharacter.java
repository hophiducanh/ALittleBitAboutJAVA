package com.tellyouiam.string.escape;

import org.apache.commons.text.StringEscapeUtils;

public class CsvStringEscapeCharacter {
	public static void main(String[] args) {
		final String input = "\"a\\tb\\n\\\"c\\\"\"";
		final String str = StringEscapeUtils.escapeCsv(input);
//		final String s = "tHIS String 'needs escaping'";
		System.out.println(input);
		System.out.println(str);
	}
}
