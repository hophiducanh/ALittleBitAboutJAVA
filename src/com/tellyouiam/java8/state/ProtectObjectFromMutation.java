package com.tellyouiam.java8.state;

import java.util.Arrays;

public class ProtectObjectFromMutation {
	public static void main(String[] args) {
		int[] total = new int[1];
		total[0] = 5;
		Runnable r = () -> total[0]++;
		r.run();
		System.out.println(Arrays.toString(total));
	}
}
