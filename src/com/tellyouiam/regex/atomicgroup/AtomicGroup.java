package com.tellyouiam.regex.atomicgroup;

import static com.tellyouiam.regex.RegexUtil.test;

/**
 * https://www.logicbig.com/tutorials/core-java-tutorial/java-regular-expressions/atomic-groups.html
 * */

public class AtomicGroup {
    public static void main(String[] args) {
        test("p(ut|u)t", "putt");
        test("p(ut|u)t", "put");
        test("p(?>ut|u)t", "put");
        test("p(?>it|u)t", "put");
        test("p(?>ut|u)t", "putt");
        test("p(?>(ut|u))\\1", "putut");
        test("p(?>(ut|u))\\1", "puu");

        test("<(image|img)>", "<image>");
        test("<(image|img)>", "<img>");
        test("<(?>image|img)>", "<img>");
        test("<(image|img)>", "<image");
        test("<(?>image|img)>", "<image");
    }
}
