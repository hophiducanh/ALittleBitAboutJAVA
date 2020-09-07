package com.tellyouiam.stacktrace;

// The d() method() is at the top of the stack because that’s where the app generated the trace.
// The main() method is at the bottom because that’s where the program started.
// When the program started, the Java runtime executed the main() method. Main() called a().
// A() called b(),  and b() called c(), which called d(). Finally, d() called dumpStack(), which generated the output.
// This Java stack trace gives us a picture of what the program did, in the order that it did it.
public class Example {
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
		Thread.dumpStack();
	}
	public static void main(String[] args) {
		a();
	}
}
