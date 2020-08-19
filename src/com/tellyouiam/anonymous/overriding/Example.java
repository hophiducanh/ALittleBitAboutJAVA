package com.tellyouiam.anonymous.overriding;

import com.tellyouiam.variable.hiding.A;

public class Example {
	static abstract class A {
		public abstract void methodA();
	}

	static class B extends A {
		@Override
		public void methodA() {
		
		}
	}
	
	static class C {
		//extend class A.
		A a = new A() {
			@Override
			public void methodA() {
				System.out.println("Anonymous method A");
			}
		};
	}
}

