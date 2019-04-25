package com.tellyouiam.constructor.thismethod;

/**
 * If you need to call the same class' constructor, then you can use this() as the first statement of the constructor.
 * It can be with or without arguments based on which constructor you want to invoke.
 * */

public class Child {
    // this is a method
    public void Child() {
        System.out.println("inside child without arguments");
    }
    // this is a default constructor
    public Child() {
        //this(); //can we call this here?. No. It is a recursive call to the default constructor
        System.out.println("inside child's default constructor");
    }
    public Child(int b) {
        this(); // invoke default constructor of Child class
        System.out.println("inside child's argument constructor");
    }
    public static void main(String[] args) {
        Child child = new Child(15);
    }
}
