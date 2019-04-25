package com.tellyouiam.constructor.constructorchaining;

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
