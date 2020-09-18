package com.tellyouiam.java8.enums.enumset;

import java.util.EnumSet;
import java.util.stream.Stream;

public class EnumSetExample {
	//enum set and enum map: https://www.techempower.com/blog/2017/02/14/enumset-and-enummap/
	public enum Color {
		RED, YELLOW, GREEN, BLUE, BLACK, WHITE;
		
		public long getStatusFlagValue() {
			return 1 << this.ordinal();
		}
	}
	
	//all the methods in an EnumSet are implemented using arithmetic bitwise operations
	//https://www.baeldung.com/java-enumset
	//https://javarevisited.blogspot.com/2014/03/how-to-use-enumset-in-java-with-example.html
	public static void main(String[] args) {
		EnumSet<Color> set = EnumSet.allOf(Color.class);
		EnumSet setX = EnumSet.of(Color.RED);
		EnumSet setY = EnumSet.noneOf(Color.class);
//		System.out.println(setX);
//		System.out.println(setY);
//		set.forEach(System.out::println);
		System.out.println(Stream.of(Color.RED).map(Color::getStatusFlagValue).findFirst().get());
	}
}
