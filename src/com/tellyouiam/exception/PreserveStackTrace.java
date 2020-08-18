package com.tellyouiam.exception;

//reference: https://www.ibm.com/support/pages/best-practice-catching-and-re-throwing-java-exceptions
public class PreserveStackTrace {
	public static void main(String[] args) {
		//lost stack trace
		try {
			int x = 5 / 0;
			System.out.println(x);
		} catch (Throwable t) {
			//Exception in thread "main" java.lang.RuntimeException: Error: / by zero
			throw new RuntimeException("Error: " + t.getMessage());
		}

		//preserve stack trace.
		try {
			int x = 5/0;
			System.out.println(x);
		} catch (Throwable t) {
			//
			throw new RuntimeException("Error: " + t.getMessage(), t);
		}
	}
}
