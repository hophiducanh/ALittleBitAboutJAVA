package com.tellyouiam.constructor.constructorchaining;

/**
 * When you invoke a constructor from another constructor, it's called constructor chaining.
 * Whether you're dealing with a standalone constructor or a parent class' constructor,
 * the end of the chain will always be the Object's class constructor
 * because every class is inherited from the Object class by default.
 * */

public class Child extends Parent {
    public void Child() {
        System.out.println("inside child without arguments");
    }

    public Child() {
        super(); // hidden call to Parent's default constructor (It means Child constructor auto call Parent constructor without super())
        System.out.println("inside child's default constructor");
    }

    public Child(int b) {
        super(b);// Case - 1 : call to Parent's argument constructor
        System.out.println("inside child's argument constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child(15);
    }
}
