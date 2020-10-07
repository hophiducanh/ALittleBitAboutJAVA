package com.tellyouiam.literals.primitivetypes.pratice;

public class HowManyFloatAreThere {
	private static long howMany(float start, float end) {
		long count = 0;
		while (start < end) {
			start = Math.nextAfter(start, end);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(howMany(0.0f, 1.0f));
	}
}
