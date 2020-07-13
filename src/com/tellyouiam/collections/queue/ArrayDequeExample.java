package com.tellyouiam.collections.queue;

import java.math.BigDecimal;
import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		
		ArrayDeque<Object> stack = new ArrayDeque<>();
		stack.push("first");
		stack.push("second");
		
		System.out.println("second".equals(stack.getFirst()));
		System.out.println(stack.pop());
	}
}
