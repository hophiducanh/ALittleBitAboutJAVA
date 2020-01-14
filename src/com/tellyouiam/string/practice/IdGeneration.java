package com.tellyouiam.string.practice;

public class IdGeneration {
	public static void main(String[] args) {
		System.out.println(String.valueOf("A Million Dreams (IRE)".toLowerCase().replaceAll("\\s", "").hashCode()));
	}
}
