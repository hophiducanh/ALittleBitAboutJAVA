package com.algorithm.bitwise.findmaxelementarray;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
			// condition only satisfy if pattern <= arr.get(i) and same length (have same msb set value) (in range 2^n -> 2^(n+1) -1)
			// pattern value halve through each iteration.
			// Nếu pattern & arr.get(i) == pattern có nghĩa rằng đang có giá trị lớn hơn pattern nằm trong arr thuộc range (2^n -> 2^(n+1) -1)
			// Nếu không max = pattern.
			// we need to add Integer.MAX_VALUE to address case arr have value in range (2^30 -> 2^31 - 1)
			if ((pattern & arr.get(i)) == pattern) {
				count++;
			}
		}
		//if count = 0 >> max = pattern.
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
			// v : 4,8,6,2,2147483647
			//if pattern = 8 >>  res = 8 >> (res | (1 << bit)) always greater than res >> ensure only have one value in list equal res (except Integer.MAX_VALUE)
			int pattern = res | (1 << bit);
			int count = checkBit(pattern, v, n);
			
			// if count | 1 != 1 set particular
			// bit in result
			// count | 1 >> always >= 1
			if ((count | 1) != 1) { //if count != 1.
				// res = res | (1 << bit) (bitwise OR)
				// https://stackoverflow.com/questions/14295469/what-does-mean-pipe-equal-operator
				// OR bitwise apply to (2^n) always return greater than original value.
				res = pattern;
				System.out.println("RES:" + res);
			}
		}
		
		return res;
	}
	
	public static long countGreaterElementWithSameMSB(List<Integer> seq, int valueAtMSBIndex) {
		return seq.stream().filter(element -> (valueAtMSBIndex & element) == valueAtMSBIndex).count();
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 8, 6, 2 };
		int n = arr.length;
		System.out.println("Largest element = " +
				largest(arr, n));
		
		List<Integer> initialSeq = Stream.concat(Stream.of(1, 5, 9, 30, 15), Stream.of(Integer.MAX_VALUE))
				.collect(Collectors.toList());
		
		AtomicInteger max = new AtomicInteger();
		Stream.iterate(31, i -> i - 1).limit(32).forEachOrdered(bitIndex -> {
			int bitCheck = max.get() | 1 << bitIndex;
			long count = countGreaterElementWithSameMSB(initialSeq, bitCheck);
			if (count > 1) {
				max.set(bitCheck);
			}
		});
		System.out.println("Max:" + max);
	}
}
