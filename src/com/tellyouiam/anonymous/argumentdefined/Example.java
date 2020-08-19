package com.tellyouiam.anonymous.argumentdefined;

public class Example {
	interface Foo {
		void methodFoo();
	}
	static class B {
		void doing(Foo f){}
	}
	
	static class A {
		void methodA() {
			B b = new B();
			b.doing(new Foo() {
				@Override
				public void methodFoo() {
					System.out.println("Method Foo");
				}
			});
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}


