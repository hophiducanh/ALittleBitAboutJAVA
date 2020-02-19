package com.tellyouiam.overloading.demo;

/**
 * @author : Ho Anh
 * @since : 16/02/2020, Sun
 **/
public class Eg {
	//same argument, same method but diff type can recognized as overloading
	public static int add (int x, int y) {
		return x + y;
	}
	
	public static int add (int x, double y) {
		return (int) (x + y);
	}
	
	public static void main(String[] args) {
		add(4,5);
		add(4,5.5);
	}
}
