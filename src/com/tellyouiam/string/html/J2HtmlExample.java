package com.tellyouiam.string.html;

import java.util.Arrays;
import java.util.stream.Collectors;

public class J2HtmlExample {
	public static String binaryToText(String binary) {
		//https://stackoverflow.com/questions/17587924/in-regex-difference-betewen-g-and
		return Arrays.stream(binary.split("(?<=\\G.{8})"))/* regex to split the bits array by 8*/
				.parallel()
				.map(eightBits -> (char)Integer.parseInt(eightBits, 2))
				.collect(
						StringBuilder::new,
						StringBuilder::append,
						StringBuilder::append
				).toString();
	}
	
	private static final String text = "01001101 01100101 01110010 01110010 01111001 00100000 01000011 01101000 01110010 01101001 01110011 01110100 01101101 01100001 01110011";
	public static void main(String[] args) {
		System.out.println(Arrays.stream(text.split(" ")).map(J2HtmlExample::binaryToText).collect(Collectors.joining()));
	}
}