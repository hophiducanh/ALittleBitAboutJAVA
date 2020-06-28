package com.algorithm.bitwise.decimaltobinary;

public class Converter {
	static String convertDecimalToBinary(Integer num) {
		String binary = "";
		do {
			int x = num % 2;
			binary = x + binary;
			num = num/2;
		} while (num > 0);
		return binary.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(convertDecimalToBinary(20));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
	}
}
