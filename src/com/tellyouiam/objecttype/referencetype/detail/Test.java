package com.tellyouiam.objecttype.referencetype.detail;

public class Test {
    public static void main(String[] args) {
        Animal a = new Horse();
        //Object type is the type of object we create actually
        //and reference type is of the type that we use for referring

        Animal b = new Animal(); //both reference and object type are Animal
        Animal c = new Horse(); //reference type is Animal and object is Horse
        Horse h = new Horse(); //both reference and object type are Horse
    }
}
