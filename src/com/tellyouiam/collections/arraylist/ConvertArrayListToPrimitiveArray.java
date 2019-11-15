package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToPrimitiveArray {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		int[] ints = ls.stream().mapToInt(i->i).toArray();
		int[] i1   = ls.stream().mapToInt(Integer::intValue).toArray();
	}
}
