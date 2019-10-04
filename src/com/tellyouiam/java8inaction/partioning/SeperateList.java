package com.tellyouiam.java8inaction.partioning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 **/
public class SeperateList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, -2, 23, 5, -11, 287, 5, -99);
		List<Integer> x = new ArrayList<>(Collections.nCopies(50, 5));
		List<Integer> y = new ArrayList<>(Collections.nCopies(50, 5));

		List<List<Integer>> result = list.stream().collect(
			() -> Arrays.asList(x,y),
			(l,i) -> { l.get(0).add(Math.max(0, i)); l.get(1).add(Math.min(0, i)); },
			(a,b) -> { a.get(0).addAll(b.get(0)); a.get(1).addAll(b.get(1)); });

		System.out.println(result.get(0));
		System.out.println(result.get(1));
	}
}
