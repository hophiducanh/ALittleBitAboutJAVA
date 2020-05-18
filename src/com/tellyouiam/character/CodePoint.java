package com.tellyouiam.character;

public class CodePoint {
	//https://stackoverflow.com/questions/23979676/java-what-are-characters-code-points-and-surrogates-what-difference-is-there
	public static void main(String[] args) {
		// To represent text in computers, you have to solve two things: first, you have to map symbols to numbers,
		// then, you have to represent a sequence of those numbers with bytes.
		// A Code point is a number that identifies a symbol. Two well-known standards for assigning numbers to symbols are ASCII and Unicode.
		// ASCII defines 128 symbols. Unicode currently defines 109384 symbols, that's way more than 216.
		int point = Character.codePointAt("String", 0);
		System.out.println(point); //83
	}
}
