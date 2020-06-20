package com.tellyouiam.java8.functionalinterface.consumer;

import java.util.function.Consumer;

/**
 * https://dzone.com/articles/be-more-functional-javas-functional-interfaces
 * */
public class Main {
	public static void main(String[] args) {
		Consumer<Integer> printAgeWithLambda = (age) -> System.out.println("Lambda : age is " + age);
		
		Consumer<Integer> printAgeConsumer  = new CustomConsumer<>();
		
		printAgeConsumer.andThen(printAgeWithLambda) //second
		.andThen(age -> System.out.println("How old is he ? " + age)) //third
		.accept(23); //first
	}
}
