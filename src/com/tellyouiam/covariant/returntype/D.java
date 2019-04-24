package com.tellyouiam.covariant.returntype;

public class D extends C {
    //covariant return type
    //overriding method, returning subtype of the super class method (Override thì return A Object nhưng ở đây return B Object)
    public B getValue() {
        return new B("Test B");
    }
}

