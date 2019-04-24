package com.tellyouiam.overriding.rules.staticmethod;

/**
 * We can declare static methods with same signature in subclass,
 * but it is not considered overriding as there won’t be any run-time polymorphism. Hence the answer is ‘No’.
 * */

public class Base {
    // Static method in base class which will be hidden in subclass
    static void display() {
        System.out.println("Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void print()  {
        System.out.println("Non-static or Instance method from Base");
    }
}
