package com.tellyouiam.collections.iterator.custom;

public class Main {
	public static void main(String[] args) {
		//https://stackoverflow.com/questions/5849154/can-we-write-our-own-iterator-in-java
		new FactorialIterable(5).forEach(System.out::println);
	}
}
