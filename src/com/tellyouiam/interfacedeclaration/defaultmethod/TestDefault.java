package com.tellyouiam.interfacedeclaration.defaultmethod;

public interface TestDefault {
    //default only use with TestDefault
    public default int m1() {
        return 1;
    }

    public default void m2() {
        ;
    }
}
