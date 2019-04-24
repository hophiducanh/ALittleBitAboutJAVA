package com.tellyouiam.overriding.rules.exceptionhandling.rule2;

/**
 * Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception.
 * Throwing parent exception in Exception hierarchy will lead to compile time error.
 * Also there is no issue if subclass overridden method is not throwing any exception
 * */

public class Child4 extends Parent {
    @Override
        // compile-time error
        // issue while throwing parent exception
        //void m1() throws Exception
    void m1() throws ExceptionInInitializerError {
        System.out.println("From child4 m1()");
    }
}
