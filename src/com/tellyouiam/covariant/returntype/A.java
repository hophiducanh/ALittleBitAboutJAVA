package com.tellyouiam.covariant.returntype;

/**
 * Reference : https://www.geeksforgeeks.org/covariant-return-types-java/
* */

class A {

    String name;

    int go(int b) {
        return b * b;
    }

    A(String name) {
        this.name = name;
    }
}
