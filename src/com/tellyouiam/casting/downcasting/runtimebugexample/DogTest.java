package com.tellyouiam.casting.downcasting.runtimebugexample;

public class DogTest {
    public static void main(String[] args) {
        //https://www.xyzws.com/javafaq/why-down-casting-throws-classcastexception/125
        Animal animal = new Animal();
        //instanceof kiểm tra kiểu tại Runtime, vì tại Runtime actual object là Object type - Animal, Animal (not a type
        // of Dog) nên: if (animal instanceof Dog) return false
        if (animal instanceof Dog) {//false
            //Nếu không có câu lệnh if này thì câu lệnh dưới sẽ ném ra ClassCastException vì không thể cast
            //subclass object to superclass (chỉ đối với )
            Dog d = (Dog) animal;
            System.out.println("Animal has dog type.");
        }

        //casting doesn't know at compile-time.
        //http://www.xyzws.com/javafaq/when-is-an-explicit-object-reference-casting-is-required/35
        Animal subAnimal = new Dog(); //runtime is Dog >> can cast.
        Dog dd = (Dog) subAnimal;
        dd.bark(); //Bark bark!!!!
    }
}
