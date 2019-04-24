package com.tellyouiam.overriding.rules.accessmodifiers;

public class Animal {
    /**
     * private method are not overridden
     * */
    //private swallow();

    protected void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}
