package com.bestpractice.number;

public class Operation {
	public static void main(String[] args) {
		float x = 5.0f;
		System.out.println(x * -1);
		System.out.println(Math.copySign(5, -1));
		
		int y = 5;
		System.out.println(y * -1);
		System.out.println(~(y -1));
		
		//No, you probably shouldn't be using it. Not unless you need a method reference.
		System.out.println(Math.negateExact(y));
	}
}
