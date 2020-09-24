package com.tellyouiam.guava.collections.set;

import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;

public class MultiSetExample {
	public static void main(String[] args) {
		//https://stackoverflow.com/questions/15329038/what-is-the-difference-between-a-list-and-a-multiset
		MultiSet<Integer> set = new HashMultiSet<>();
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		System.out.println(set.getCount(1));
	}
}
