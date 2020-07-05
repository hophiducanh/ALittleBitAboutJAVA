package com.tellyouiam.collections.queue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * offer() – Inserts a new element onto the Queue
 * poll() – Removes an element from the front of the Queue
 * peek() – Inspects the element at the front of the Queue, without removing it
 * */
public class DIYQueue<T> extends AbstractQueue<T> {
	
	private LinkedList<T> elements;
	
	public DIYQueue() {
		this.elements = new LinkedList<T>();
	}
	
	@Override
	public Iterator<T> iterator() {
		return elements.iterator();
	}
	
	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public boolean offer(T t) {
		if (t == null) return false;
		elements.add(t);
		return true;
	}
	
	@Override
	public T poll() {
		Iterator<T> iter = elements.iterator();
		T t = iter.next();
		if (t != null) {
			iter.remove();
			return t;
		}
		return null;
	}
	
	@Override
	public T peek() {
		return elements.getFirst();
	}
}

class Main {
	public static void main(String[] args) {
		DIYQueue<Integer> diyQueue = new DIYQueue<>();
		diyQueue.add(5);
		diyQueue.add(7);
		System.out.println(diyQueue.peek());
	}
}