package com.tellyouiam.string.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Ho Anh
 * @since : 21/10/2019, Mon
 **/
public class SortString {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("X", "K", "M", "D", "E", "F");
		List<String> emails = Arrays.asList("D", "E", "F", "X", "M", "K");
		names.sort(String::compareToIgnoreCase);
		emails.sort(String::compareToIgnoreCase);
		System.out.println(names);
		System.out.println(emails);
		if (names.equals(emails)) {
			System.out.println("true");
		}
	}
}
