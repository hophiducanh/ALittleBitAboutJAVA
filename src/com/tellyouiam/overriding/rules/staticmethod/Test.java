package com.tellyouiam.overriding.rules.staticmethod;

public class Test {
    public static void main(String[] args) {
        Base obj1 = new Derived();

        // As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        obj1.display();

        // Here overriding works and Derive's print() is called
        obj1.print();

    }
}
