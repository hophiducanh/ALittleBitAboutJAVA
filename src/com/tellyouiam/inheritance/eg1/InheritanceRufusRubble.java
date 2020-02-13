package com.tellyouiam.inheritance.eg1;

/**
 * @author : Ho Anh
 * @since : 13/02/2020, Thu
 **/

/*
* You might wonder why the output was x=40 - this is because PRIORITY IS ALWAYS GIVEN TO A LOCAL VARIABLE.
* In the child class, in our show() method, parent class members can be accessed, for example, we can access
* the Base class by using super keyword.
* */
public class InheritanceRufusRubble {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}
}
