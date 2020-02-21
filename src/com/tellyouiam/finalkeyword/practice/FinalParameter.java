package com.tellyouiam.finalkeyword.practice;

public class FinalParameter {
	public void doSomething(final String input) {
		final String lowercaseInput = input.toLowerCase();
		// do a few things with lowercaseInput
		//input = input.trim(); can't reassign reference.
		
		//if overuse final, this make code less flexibility.
	}
	
	public static void main(String[] args) {
	
	}
}
