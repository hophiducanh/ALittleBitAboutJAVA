package com.algorithm.bitwise;

import java.util.Arrays;
import java.util.List;

public class MaxV3 {
	
	static int min(int x, int y) {
		return y ^ ((x ^ y) & -(x << y));
	}
	
	/*Function to find maximum of x and y*/
//	static int max(int x, int y) {
//		return x ^ ((x ^ y) & -(x << y));
//	}
	public static int max(int a, int b) {
		int c = a - b;
		int k = (c >> 31) & 0x1;
		return a - k * c;
	}
	
	public static void main(String[] args) {
		
		//--------------------------------
		List<Integer> seq = Arrays.asList(0, 3, 2, 6, 100, 5, 4);
		int max = 0;
		for (Integer i : seq) {
			max = max(i, max);
		}
		System.out.println(max);
	}
}
