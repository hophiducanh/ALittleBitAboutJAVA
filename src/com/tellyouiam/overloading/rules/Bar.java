package com.tellyouiam.overloading.rules;

import java.io.IOException;

/**
 * Overloaded methods MUST change the argument list.
 * Overloaded methods CAN change the return type.
 * Overloaded methods CAN change the access modifier.
 * Overloaded methods CAN declare new or broader checked exceptions.
 * A method can be overloaded in the same type or in a subtype. In other words, if class A
 * defines a doStuff(int i) method, the subclass B could define a doStuff(String s) method
 * without overriding the superclass version that takes an int. So two methods with the same name
 * but in different types can still be considered overloaded if the subtype inherits one version of the
 * method and then declares another overloaded version in its type definition.
 * */

public class Bar extends Foo {
    //Overloaded methods MUST change the argument list.
    public void changeSize (int size, String name) {}

    //Overloaded methods CAN change the return type
    //Overloaded methods CAN change the access modifier
    private int changeSize (int size, float pattern) {
        return size;
    }

    //Overloaded methods CAN declare new or broader checked exceptions
    public void changeSize (Float pattern, String name) throws IOException {}

}
