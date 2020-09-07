package com.tellyouiam.stacktrace;

//https://www.scalyr.com/blog/java-stack-trace-understanding/
public class StackTraceWithException {
	static void a() {
		b();
	}
	static void b() {
		c();
	}
	static void c() {
		d();
	}
	static void d() {
		throw new NullPointerException("Oops!");
	}
	
	public static void main(String[] args) {
		try {
			a();
		} catch (NullPointerException e) {
//			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
