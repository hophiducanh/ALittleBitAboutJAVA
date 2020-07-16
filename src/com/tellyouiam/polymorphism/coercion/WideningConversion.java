package com.tellyouiam.polymorphism.coercion;

public class WideningConversion {
	//The above code will work without an error in Java. We are passing an int value ’98’ wherein the expected value type is a float.
	//Java implicitly converts int value to float and it supports widening conversion.
	private static float fToC(float fahrenheit) {
		return (fahrenheit - 32)*5/9;
	}
	
	public static void main(String args[]) {
		System.out.println(fToC(98));
	}
}
