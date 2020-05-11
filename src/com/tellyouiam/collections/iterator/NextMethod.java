package com.tellyouiam.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NextMethod {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>(1);
		//ls = new LinkedList<>();
		/*can't add more in fixed size ArrayList*/
//		ls.addAll(1, Collections.singleton(2));
//		ls.forEach(System.out::println);
		
		List<Integer> lss = new ArrayList<>(1);
		lss = new LinkedList<>();
		
		/**
		 * Object next(): It returns the next element in the collection until the hasNext()method return true.
		 * This method throws ‘NoSuchElementException’ if there is no next element.
		 * */
		
		List<Integer> list = Arrays.asList(1, 2);
		System.out.println(list.iterator().next()); //1 >> GET THE FIRST ONE
		
		Iterable<Integer> i = Arrays.asList(1,1,1);
		for (Integer ii : i ) {
			ii.byteValue();
		}
	}
}
