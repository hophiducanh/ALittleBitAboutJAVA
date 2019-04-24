package com.tellyouiam.overriding.rules.invoke.superclassmethod.normalsuperclass;

public class Child extends Parent {

    // This method overrides show() of Parent

    @Override
    void show() {
        /*
         * Using super to invoke an overridden method applies only to instance methods
         * */
        super.show();
        System.out.println("Child's show()");
    }
}
