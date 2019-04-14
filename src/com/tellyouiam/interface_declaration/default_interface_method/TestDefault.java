package com.tellyouiam.interface_declaration.default_interface_method;

public interface TestDefault {
    //default only use with TestDefault
    public default int m1() {
        return 1;
    }

    public default void m2() {
        ;
    }
}
