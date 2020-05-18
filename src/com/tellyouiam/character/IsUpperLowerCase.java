package com.tellyouiam.character;

public class IsUpperLowerCase {
	/*
	* If input is between 'A' and 'Z' its uppercase
	* If input is between 'a' and 'z' its lowercase
	* If input is one of 'a,e,i,o,u,A,E,I,O,U' its Vowel
	* */
	private static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
	
	static boolean isVowel(char ch) {
		for (char vowel : VOWELS) {
			if (vowel == ch) {
				return true;
			}
		}
		return false;
	}
	
	static boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	static boolean isLowerCase(char ch) {
		return ch >= 'a' && ch <= 'z';
	}
	
	static boolean isUpperCase(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}
	
	public static void main(String[] args) {
	
	}
}
