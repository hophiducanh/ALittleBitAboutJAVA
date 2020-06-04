package com.algorithm.bitwise;

import java.util.Vector;

//https://www.geeksforgeeks.org/find-largest-element-array-without-using-conditional-operator/
public class FindLargestElementArray {
	// Utility function to check number of
	// elements having set msb as of pattern
	static int checkBit(int pattern, Vector<Integer> arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			
			// Integer.MAX_VALUE: 1111111111111111111111111111111
			// pattern usually is power of 2
			// 2 > 10
			// 4 > 100
			// 8 > 1000
			// 16 > 10000
			// condition only satisfy if pattern < arr.get(i)
			if ((pattern & arr.get(i)) == pattern) {
				count++;
			}
		}
		return count;
	}
	
	static int largest(int[] arr, int n) {
		Vector<Integer> v = new Vector<>();
		for (Integer a : arr)
			v.add(a);
		
		// Insert INT_MAX and update n
		// 2147483647 == 1111111111111111111111111111111
		// even number >> binary end with 0
		// odd number >> binary end with 1
		v.add(Integer.MAX_VALUE);
		n++;
		
		int res = 0;
		
		// Iterate over total of 30bits from
		// msb to lsb
		for (int bit = 31; bit >= 0; bit--) {
			
			// Find the count of element having set msb
			// << Shifting this bit pattern to the left one position
			// https://stackoverflow.com/questions/31238370/1-left-shift-by-31
			// left shift double value, right shift halve value.
			int count = checkBit(res | (1 << bit), v, n);
			
			// if count | 1 != 1 set particular
			// bit in result
			if ((count | 1) != 1) { //if count != 1.
				// res = res | (1 << bit) (bitwise OR)
				// https://stackoverflow.com/questions/14295469/what-does-mean-pipe-equal-operator
				// OR bitwise apply to (2^n) always return greater than original value.
				res = res | (1 << bit) ;
				System.out.println(res);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 8, 6, 2 };
		int n = arr.length;
		System.out.println("Largest element = " +
				largest(arr, n));
	}
}
