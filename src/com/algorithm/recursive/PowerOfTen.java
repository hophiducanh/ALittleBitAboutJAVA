package com.algorithm.recursive;

public class PowerOfTen {
	private static int powerOfTen(int nth) {
		if (nth < 0) throw new IllegalArgumentException();
		if (nth == 0) return 1;
		return 10 * powerOfTen(nth - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(powerOfTen(0));
		System.out.println(-1.0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Double.MIN_VALUE);
		System.out.println("Max: " + -Double.MAX_VALUE);
		System.out.println(Double.MIN_NORMAL);
		
		Double x = -10.0D;
		System.out.println(x);
		long l = Double.doubleToRawLongBits(1.1);
		System.out.println(l);
	}
}
