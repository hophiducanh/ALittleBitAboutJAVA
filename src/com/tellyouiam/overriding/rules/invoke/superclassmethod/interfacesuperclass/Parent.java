package com.tellyouiam.overriding.rules.invoke.superclassmethod.interfacesuperclass;

public interface Parent {
    default void foo() {
        System.out.println("Parent.foo");
    }
}
