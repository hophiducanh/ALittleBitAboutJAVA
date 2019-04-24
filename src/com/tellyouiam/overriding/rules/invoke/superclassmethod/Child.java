package com.tellyouiam.overriding.rules.invoke.superclassmethod;

public class Child extends Parent {

    // This method overrides show() of Parent

    @Override
    void show() {
        super.show();
        System.out.println("Child's show()");
    }
}
