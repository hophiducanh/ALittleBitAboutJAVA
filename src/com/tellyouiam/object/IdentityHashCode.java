package com.tellyouiam.object;

public class IdentityHashCode {
	//https://stackoverflow.com/questions/21208308/adding-and-subtraction-chars-why-does-this-work-java
	//https://stackoverflow.com/questions/1961146/memory-address-of-variables-in-java
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object);
		System.out.println(Integer.toHexString(System.identityHashCode(object)));
		int x = "abc".charAt(1) - 48;
		System.out.println(x);
		System.out.println(0 == '\u0000');
		System.out.println('A' == 65);
	}
}
