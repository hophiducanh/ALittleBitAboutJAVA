package com.tellyouiam.java8.enumset;

import java.util.EnumSet;

public class EnumSetExample {
	public enum Color {
		RED, YELLOW, GREEN, BLUE, BLACK, WHITE
	}
	
	//all the methods in an EnumSet are implemented using arithmetic bitwise operations
	//https://www.baeldung.com/java-enumset
	//https://javarevisited.blogspot.com/2014/03/how-to-use-enumset-in-java-with-example.html
	public static void main(String[] args) {
		EnumSet<Color> set = EnumSet.allOf(Color.class);
		EnumSet setX = EnumSet.of(Color.RED);
		EnumSet setY = EnumSet.noneOf(Color.class);
		System.out.println(setX);
		System.out.println(setY);
		set.forEach(System.out::println);
	}
}
