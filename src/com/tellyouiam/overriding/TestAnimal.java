package com.tellyouiam.overriding;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
    }
}
