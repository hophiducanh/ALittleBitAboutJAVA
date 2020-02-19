package com.tellyouiam.staticimport;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;
import static java.lang.System.out;

//must be declare explicitly coz java.lang.Long has same MAX_VALUE

//Declaration Top-level Class
public class TestStaticImport {
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }

}
