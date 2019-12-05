package com.tellyouiam.object;

public class GetClassMethod {
	public static void main(String[] args) {
		String x = "Hello";
		String y = x;
		//Returns the runtime class of this {@code Object}
		if (x.getClass() == y.getClass())
			System.out.println("Y");
	}
}
