package com.tellyouiam.accessmodifiers.localvariable;

public class Foo {
    void doSuff() {
        //Không thể apply access modifier cho local variable, only global variable
        //private int x = 7;

        //Nhưng non-access variable thì có
        final int x = 7;
    }
}
