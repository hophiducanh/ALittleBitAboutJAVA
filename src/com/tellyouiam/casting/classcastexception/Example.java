package com.tellyouiam.casting.classcastexception;

/**
 * @author : Ho Anh
 * @since : 21/02/2020, Fri
 **/
public class Example {
	public static void main(String[] args) {
		Object i = Integer.valueOf(42);
		String s = (String)i;
		//Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
		System.out.println(s);
	}
}
