package com.tellyouiam.string.practice;

/**
 * @author : Ho Anh
 * @since : 01/10/2019, Tue
 **/
public class ReadNullValueAsString {
	private static final String NULL_VALUE_AS_STRING = "NULL";

	private static String readCsvRow(String[] r, int index) {
		if (r[index].equalsIgnoreCase(NULL_VALUE_AS_STRING))
			return "";
		return r[index].replace("\"", "").trim();
	}
	public static void main(String[] args) {
		String[] rows = new String[]{"Ho", "Anh", "Null", "NULL"};
		System.out.println(readCsvRow(rows, 3));
		System.out.println(readCsvRow(rows, 2));
		String email = readCsvRow(rows, 2);
		System.out.println(email);
	}
}
