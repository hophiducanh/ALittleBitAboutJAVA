package com.tellyouiam.java8.exception.checkedexception;

import java.io.IOException;

//https://stackoverflow.com/questions/27644361/how-can-i-throw-checked-exceptions-from-inside-java-8-streams?noredirect=1&lq=1
public class Main {
	public static void main(final String... args) throws Exception {
		final Stream<String> s = null;
		
		// Works: E is ClassNotFoundException.
		
		// Works: E is RuntimeException (probably).
		s.map(Main::convertClass);
		
		// Works: E is ClassNotFoundException.
		s.map(Main::throwSome);
		
		// Doesn't work: E is Exception.
		s.map(Main::throwSomeMore);  // error: unreported exception Exception; must be caught or declared to be thrown
	}
	
	private static Class convertClass(final String s) {
		return Main.class;
	}
	
	private static class FooException extends ClassNotFoundException {}
	
	private static class BarException extends ClassNotFoundException {}
	
	private static Class throwSome(final String s) throws FooException, BarException {
		throw new FooException();
	}
	
	private static Class throwSomeMore(final String s) throws ClassNotFoundException, IOException {
		throw new FooException();
	}
}
