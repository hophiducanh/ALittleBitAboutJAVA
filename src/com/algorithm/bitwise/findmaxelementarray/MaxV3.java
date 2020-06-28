package com.algorithm.bitwise.findmaxelementarray;

public class MaxV3 {
	
	static int min(int x, int y) {
		return y ^ ((x ^ y) & -(x << y));
	}
	
	/*Function to find maximum of x and y*/
//	static int max(int x, int y) {
//		return x ^ ((x ^ y) & -(x << y));
//	}
	public static int getLargerNumber(int a, int b) {
		int c = a - b;
		//get sign bit's value
		int k = (c >> 31) & 0x1;
		return a - k * c;
	}
	
	public static void main(String[] args) {
		
		//--------------------------------
		int[] seq = new int[]{0, -3, -2, -6, 20, -5, -4};
		int max = 0;
		for (Integer i : seq) {
			max = getLargerNumber(i, max);
		}
		System.out.println(max);
	}
}
