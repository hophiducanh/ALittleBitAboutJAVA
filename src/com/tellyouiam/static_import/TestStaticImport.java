package com.tellyouiam.static_import;

import static java.lang.System.out;
//must be declare explicitly coz java.lang.Long has same MAX_VALUE
import static java.lang.Integer.*;

//Declaration Top-level Class
public class TestStaticImport {
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }

}
