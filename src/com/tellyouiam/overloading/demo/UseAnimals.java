package com.tellyouiam.overloading.demo;

public class UseAnimals {
    private void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }

    private void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        ua.doStuff(animalObj); //In the Animal version
        ua.doStuff(horseObj); //In the Horse version

        //OK.
        //But what if you use an Animal reference to a Horse object?

        Animal animalRefToHorse = new Horse();

        ua.doStuff(animalRefToHorse); //in the Animal version

        //Which of the overloaded versions is invoked? You might want to answer, “The one that takes a Horse
        //since it’s a Horse object at runtime that’s being passed to the method.” But that’s not how it works. The
        //preceding code would actually print this:
        /*in the Animal version*/

        /**
         * Even though the actual object at runtime is a Horse and not an Animal, the choice of which overloaded
         * method to call (in other words, the signature of the method) is NOT dynamically decided at runtime.
         * Just remember that the reference type (not the object type) determines which overloaded method is
         * invoked!
         * Hence: Animal animalRefToHorse = new Horse(); is not POLYMORPHISM
         * */

    }
}
