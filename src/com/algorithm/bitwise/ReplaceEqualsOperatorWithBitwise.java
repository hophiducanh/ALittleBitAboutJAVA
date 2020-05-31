package com.algorithm.bitwise;

public class ReplaceEqualsOperatorWithBitwise {
	public static int isEqual(int x, int y) {
		return x ^ y;
	}
	public static void main(String[] args) {
		//return 0 >> equals >> (A XOR A = 0)
		int c = isEqual(4,4);
		System.out.println(c);
		
		//return 1 >> NOT equals
		int d =  isEqual(4,5);
		System.out.println(d);
	}
}
