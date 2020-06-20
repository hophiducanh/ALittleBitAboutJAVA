package com.tellyouiam.inheritance.eg;

/**
 * @author : Ho Anh
 * @since : 13/02/2020, Thu
 **/
public class InheritanceRufusRubble {
	public static void main(String[] args) {
		Child child = new Child();
		//child.subtraction();//120
		
		Base base = new Child();
		//compile time:
		//goto implementation is addition method in Base class but at runtime method was called is it child class
		//About Statically Type Language
		//https://trello.com/c/yjK5DZrQ/221-about-statically-type-language
		System.out.println(base.addition());;
	}
}
