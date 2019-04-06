package com.tellyouiam.java_reflection.o7planning.model;

public class Cat extends Animal implements Say {

    public static final String SAY = "Meo meo";
    public static final int NUMBER_OF_LEGS = 4;

    private String name;

    private int age;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
        this.age = 1;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    // Private Method.
    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int getNumberOfLegs() {
        return 0;
    }

//    @Override
//    public String getLocation() {
//        return null;
//    }

    @Override
    public String say() {
        return null;
    }
}
