package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllAndRemoveAll {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> lss = new ArrayList<>(Arrays.asList(1, 2, 3));
		ls.retainAll(lss);
		System.out.println(ls);
//		System.out.println(ls.removeAll(lss));
	}
}
