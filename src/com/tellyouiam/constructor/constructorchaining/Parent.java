package com.tellyouiam.constructor.constructorchaining;

public class Parent {
    // this is a method not a constructor
    public void Parent() {
        System.out.println("inside parent without argument");
    }

    //This is a default constructor
    public Parent() {
        super(); // hidden call to Object's default constructor (auto call Object's default constructor without super())
        System.out.println("inside parent's default constructor");
    }

    public Parent(int a) {
        super(); // hidden call to Object's default constructor
        System.out.println("inside parent's argument constructor");
    }
}
