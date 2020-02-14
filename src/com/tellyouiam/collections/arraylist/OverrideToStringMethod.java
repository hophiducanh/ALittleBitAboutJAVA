package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OverrideToStringMethod {
	
	public static String toString(int arr[]) {
		//map and mapToObj diff >> map use for primitive type
		//mapToObj >> use for converting primitive type to Obj.
		//IntFunction: accepts an int-valued argument and produces a result.
		return Arrays.stream(arr).mapToObj(s -> "0" + s)
				.collect(Collectors.joining(", ", "[", "]"));
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		System.out.println(toString(arr));
	}
}
