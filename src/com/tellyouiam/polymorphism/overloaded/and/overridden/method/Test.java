package com.tellyouiam.polymorphism.overloaded.and.overridden.method;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Horse h = new Horse();
        //h.eat();

        Animal ah = new Horse();
        ah.eat(); //polymorphism

        Horse he = new Horse();
        //he.eat("Apples");

        Animal a2 = new Animal();
        //a2.eat("treats");

        Animal ah2 = new Horse();
        //ah2.eat("Carrots"); //Compiler error coz this is overloading eat() method hence Reference Type
        // determine what's method to called. But Animal class doesn't have eat(String abc) method -> error
    }
}
