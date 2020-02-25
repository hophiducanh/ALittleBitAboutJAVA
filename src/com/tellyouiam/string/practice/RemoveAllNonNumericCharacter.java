package com.tellyouiam.string.practice;

public class RemoveAllNonNumericCharacter {
	public static void main(String[] args) {
		String str = "abc. xyz 123 ...";
		System.out.println(str.replaceAll("[^\\d]+", ""));
	}
}
