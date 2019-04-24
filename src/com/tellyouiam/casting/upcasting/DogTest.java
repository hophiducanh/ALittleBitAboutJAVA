package com.tellyouiam.casting.upcasting;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal1 = dog; //upcast ok with NO EXPLICIT cast
        Animal animal2 = (Animal) dog; //upcast ok with EXPLICIT cast

        //upcasting don't need to use instanceof and run without any exception coz Dog IS-A Animal, don't like downcasting
    }
}
