package com.tellyouiam.guava.collections;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

import java.util.Arrays;

public class BagExample {
	//https://www.baeldung.com/apache-commons-bag
	//https://stackoverflow.com/questions/43428114/reasons-for-using-a-bag-in-java#:~:text=You%20can%20think%20of%20Bag,is%20one%20directional%20linked%2Dlist.
	public static void main(String[] args) {
		Bag<Integer> bag = new HashBag<>();
		bag.addAll(Arrays.asList(1, 2, 3, 3, 3, 3, 1, 4));
		System.out.println(bag.getCount(1));
	}
}
