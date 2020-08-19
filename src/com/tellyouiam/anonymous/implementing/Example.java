package com.tellyouiam.anonymous.implementing;

public class Example {
	interface interfaceA {
		void methodA(String str);
	}
	
	interface interfaceB {
		void methodB(String str);
	}
	
	static class B {
		interfaceA a = new interfaceA() {
			@Override
			public void methodA(String str) {
				System.out.println("anonymous methodA implementer: " + str);
			}
		};
	}
	
	static void myMethod() {
		//local inner class
		class Impl extends Thread implements interfaceA, interfaceB {
			
			@Override
			public void methodA(String str) {
				System.out.println(str);
			}
			
			@Override
			public void methodB(String str) {
			
			}
		}
		new Impl().methodA("data");
	}
	
	public static void main(String[] args) {
		myMethod();
	}
}
