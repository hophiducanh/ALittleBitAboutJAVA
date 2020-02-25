package com.tellyouiam.string.compare;

/**
 * @author : Ho Anh
 * @since : 23/02/2020, Sun
 **/
public class CompareMethod {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "AAAA";
		
		if (str.compareTo(str1) > 0) {
			System.out.println("True");
		}
		
		String str2 = "A";
		String str3 = "a";
		
		if (str2.compareTo(str3) > 0) {
			System.out.println("True");
		}
	}
}
