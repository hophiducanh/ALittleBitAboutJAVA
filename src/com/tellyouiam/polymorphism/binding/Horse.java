package com.tellyouiam.polymorphism.binding;

public class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay");
    }
    public void eat (String s) {
        System.out.println("Horse eating " + s);
    }
}
