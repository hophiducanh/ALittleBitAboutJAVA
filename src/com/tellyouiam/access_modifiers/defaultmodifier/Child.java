package com.tellyouiam.access_modifiers.defaultmodifier;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.testId();
    }
    private void testId() {
        //Just remember that default members are visible to subclasses only if those subclasses are in the same package
        //as the superclass.
        System.out.println("Variable x is:" + x);
    }
}
