package com.tellyouiam.exception.mistake;

public class Example {
	//https://stackoverflow.com/questions/23041570/throw-exception-inside-catch-clause
	public static void main(String[] str) {
		try {
			foo();
		} catch (RuntimeException ife) {
			System.out.println(ife);
		}
	}
	
	static private void foo() throws NumberFormatException {
		try {
			int i = Integer.parseInt("ten");
		} catch (Exception e) {
//			throw e;
			throw new RuntimeException(e);
		}
	}
	
//	static private void foo() throws NumberFormatException, Exception {
//		try {
//			int i = Integer.parseInt("ten");
//		} catch (Exception e) {
//			throw new Exception();
//		}
//	}
}
