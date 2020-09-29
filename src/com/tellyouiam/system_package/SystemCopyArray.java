package com.tellyouiam.system_package;

import java.util.Arrays;

public class SystemCopyArray {
	public static void main(String[] args) {
		int[] arr = {23, 33, 45};
		final int[] copyArr = new int[3];
		System.arraycopy(arr, 0, copyArr, 0, 3);
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.toString(arr.clone()));
	}
}
