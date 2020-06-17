package com.tellyouiam.java8.pitfall;

public class InstantiateFunctionalInterface {
	public static void main(String[] args) {
		Foo foo = parameter -> parameter + " from Foo";
		
		//Shouldn't use this
		Foo fooByIC = new Foo() {
			@Override
			public String method(String string) {
				return string + " from Foo";
			}
		};
	}
}
