package com.tellyouiam.overriding.rules.invoke.superclassmethod.interfacesuperclass;

public class Child implements Parent {
    @Override
    public void foo() {
        //you could completely override the default implementations
        //doSomethingElse();
        //or manage conflicts between the same method foo() in both A and C
        Parent.super.foo();
        //super.foo(); không gọi được như ở normalsuperclass
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.foo(); //Parent.foo
    }
}
