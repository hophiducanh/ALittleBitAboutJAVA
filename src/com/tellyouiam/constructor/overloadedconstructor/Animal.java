package com.tellyouiam.constructor.overloadedconstructor;

public class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    Animal() {
        this(makeRandomName());
    }

    //if makeRandomName is non-static
//    Animal() {
//        this(new Animal().makeRandomName());
//    }

     static String makeRandomName() {
         int x = (int) (Math.random() * 5);
        String names = new String[] {"Fluffy", "Fido", "Rover", "Spike", "Gigi"} [x];
        return names;
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        Animal b = new Animal("Zeus");
        System.out.println(b.name);
    }
}
