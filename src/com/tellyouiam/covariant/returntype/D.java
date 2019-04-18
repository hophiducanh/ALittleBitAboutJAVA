package com.tellyouiam.covariant.returntype;

public class D extends C {
    //covariant return type
    //overriding method, returning subtype of the super class method
    public B getValue() {
        return new B("Test B");
    }
}

