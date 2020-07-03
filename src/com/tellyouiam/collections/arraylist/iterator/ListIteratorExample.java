package com.tellyouiam.collections.arraylist.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Difference between iterator and listIterator is about Traversal Direction:
 * ListIterator has BIDIRECTIONAL way to traverse through list (hasPrevious() and hasNext()) and so on.
 * Check here for more info: https://javahungry.blogspot.com/2015/08/difference-between-iterator-and-listiterator-with-example.html
 * */
public class ListIteratorExample {
	public static void main(String[] args) {
		List<Object> ls = Arrays.asList(1, 2, 3);
		for (ListIterator iterator = ls.listIterator(); iterator.hasNext();) {
			Object b = iterator.next();
			System.out.println(b);
		}
		
		System.out.println("HAS PREVIOUS");
		for (ListIterator iterator = ls.listIterator(ls.size()); iterator.hasPrevious();) {
			Object b = iterator.previous();
			System.out.println(b);
		}
		
		Iterator iterator = ls.iterator();
		//iterator.add() -- not supported
		
		
		ListIterator<Object> listIterator = ls.listIterator();
		listIterator.add(5);
		listIterator.nextIndex();
		listIterator.previousIndex();
	}
}
