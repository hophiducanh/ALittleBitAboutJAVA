package com.tellyouiam.collections.linkedlist;

import java.util.LinkedList;

//https://stackoverflow.com/questions/31365998/is-there-any-doubly-linked-list-implementation-in-java
//https://dzone.com/articles/doubly-linked-list-in-java
public class DoublyLinkedListExample {
	public static void main(String[] args) {
		//listIterator default at the index 0.
		String pre = new LinkedList<String>().listIterator().previous();
		String next = new LinkedList<String>().listIterator().next();
		String specific = new LinkedList<String>().listIterator(1).next();
	}
}
