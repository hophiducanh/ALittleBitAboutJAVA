package com.tellyouiam.variable.hiding;

/**
 * @author : Ho Anh
 * @since : 12/02/2020, Wed
 **/
public class Main {
	//checking about compile-time reference rule. Only variable in SuperClass is valid to call at compile-time.
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println("A foo: " + A.foo);
		System.out.println("A foo: " + A.foo);
//		System.out.println("B foo: " + new B().foo);
		
		/*
		* This seemingly makes sense. The first line clearly uses the value of foo in class A, and in the second line,
		* class B has a variable also called foo, so the value of foo in class B hides the value of foo in class A.
		* So what happens when we run the next two lines?
		* */
		
		
	}
}
