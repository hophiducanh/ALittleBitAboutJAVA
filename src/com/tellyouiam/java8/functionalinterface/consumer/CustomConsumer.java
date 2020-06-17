package com.tellyouiam.java8.functionalinterface.consumer;

import java.util.function.Consumer;

public class CustomConsumer<T> implements Consumer<T> {
	
	@Override
	public void accept(T t) {
		System.out.println("Age is: " + t);
	}
}
