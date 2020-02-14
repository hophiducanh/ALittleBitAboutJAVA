package com.tellyouiam.variable.argument;

import com.tellyouiam.javareflection.o7planning.model.Animal;

public class Vararg {
    /**
     *  LEGAL
    * */
    //expects from 0 to many ints
    void doStuff(int... x) {}

    //expects first a char, then 0 to many ints
    void doStuff2(char c, int... x) {}

    //0 to many Animals
    void doStuff3(Animal... animal) {}


    /**
     * ILLEGAL
    * */

    //void doStuff4(int x ...)  //bad syntax
    //void doStuff5(int... x, char... y) {} //too many var-args
    //void doStuff6(String... s, byte b) {} //var-arg must be last
}
