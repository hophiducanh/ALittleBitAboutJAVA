package com.tellyouiam.collections.linkedlist;

import java.util.LinkedList;

public class FlexiableAddingElement {
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		ls.offer(5);
		ls.offerFirst(6);
		ls.offerLast(7);
		ls.forEach(System.out::println);
		//TODO: peek and poll
		//http://www.davismol.net/2014/04/04/java-ocpjp7-difference-between-element-peek-poll-and-remove-methods-of-the-queue-interface/
	}
}
