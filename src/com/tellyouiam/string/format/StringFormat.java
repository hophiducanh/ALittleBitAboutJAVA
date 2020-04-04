package com.tellyouiam.string.format;

/**
 * @author : Ho Anh
 * @since : 21/08/2019, Wed
 **/
public class StringFormat {
	public static void main(String args[])
	{
		String str = "GeeksforGeeks.";

		// Concatenation of two strings
		String gfg1 = String.format("My Company name is %s", str);

		// Output is given upto 8 decimal places
		String str2 = String.format("My answer is %s", null);

		// between "My answer is" and "47.65734000" there are 15 spaces
		String str3 = String.format("My answer is %15.8f", 47.65734);

		System.out.println(gfg1);
		System.out.println(str2);
		System.out.println(str3);
		boolean x;
		x = false;
		boolean a = true;
		boolean b = false;
		Boolean c = null;

		String query = "a";
		String formatter = String.format("%%%s%%", query);
		System.out.println(formatter);
	}
}
