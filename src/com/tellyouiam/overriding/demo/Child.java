package com.tellyouiam.overriding.demo;

public class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show() { System.out.println("Child's show()"); }
}
