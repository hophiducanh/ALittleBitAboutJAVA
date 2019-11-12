package com.tellyouiam.integer;

public class EqualityOperator {
	public static void main(String[] args) {
		Integer a = 1000, b = 1000;
		System.out.println(a==b); //false
		
		Integer c = 100, d = 100;
		System.out.println(c==d); //true
		
		/*
		* This is actually where it gets interesting. If you look into the Integer.java class , you will find that there is an inner private class,
		* IntegerCache.java that caches all Integer objects between -128 and 127.
		* So the thing is, all small integers are cached internally and when we declare something like –
		* Integer x = 100;
		* Reference: https://dzone.com/articles/why-1000-1000-returns-false-but-100-100-returns-tr
		* */
	}
}
