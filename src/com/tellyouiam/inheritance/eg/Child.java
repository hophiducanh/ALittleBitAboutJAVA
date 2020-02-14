package com.tellyouiam.inheritance.eg;

/**
 * @author : Ho Anh
 * @since : 13/02/2020, Thu
 **/

//Our child class will inherit both the addition method and the x field from our Base class
public class Child extends Base {
	int z;
	public void subtraction() {
		z = addition() -x;
		System.out.println(z);
	}
}
