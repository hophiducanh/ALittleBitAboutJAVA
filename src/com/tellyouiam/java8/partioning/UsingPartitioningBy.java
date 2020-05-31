package com.tellyouiam.java8.partioning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @author : Ho Anh
 * @since : 04/10/2019, Fri
 *
 * Reference: https://stackoverflow.com/questions/43766534/how-to-separate-a-list-by-a-condition-using-java-8-streams/43766735
 **/
public class UsingPartitioningBy {
	public static void main(String[] args) {
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = null;
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		even = myList.stream()
			.filter(item -> {
				if(item%2 == 0) { return true;}
				else {
					odd.add(item);
					return false;
				}
			})
			.collect(Collectors.toList());

		//We need to rewrite this function with more efficient way

		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		Map<Boolean, List<Integer>> evenAndOdds = ls.stream()
			.collect(partitioningBy(i -> i % 2 == 0));

		List<Integer> evens = evenAndOdds.get(true);
		List<Integer> odds = evenAndOdds.get(false);
	}
}
