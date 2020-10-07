package com.tellyouiam.literals.primitivetypes.integerliterals;

/**
 * As of Java 7, numeric literals can be declared using
 * underscore characters (_), ostensibly to improve readability. Let’s compare a pre-Java 7 declaration to an
 * easier-to-read Java 7 declaration
 * */

public class NumericLiteral {
    int pre7 = 1000000; //pre Java 7 - we hope it's a million
    int with7 = 1_000_000; //much clearer

    /**
     * The main rule you have to keep track of is that you CANNOT use the underscore literal at the
     * beginning or end of the literal. The potential gotcha here is that you’re free to use the underscore in
     * “weird” places:
     * */

    //int i1 = _1_000_000; //illegal, can't begin with an "_"
    //int i2 = 10_0000_0;  //legal but confusing

    /**
     * As a final note, remember that you can use the underscore character for any of the numeric types
     * (including doubles and floats), but for doubles and floats, you CANNOT add an underscore character
     * directly next to the decimal point, or next to the X or B in hex or binary numbers
     * */

    //double aDouble = 1._000; //illegal

    //Hexadecimal Literals:
    int x = 0X0_001; //legal
    //int y = 0X_0001; //illegal

    //Binary Literals: Binary literals can use only the
    //digits 0 and 1. Binary literals must start with either 0B or 0b, example:

    int b1 = 0B101_010;
    int b2 = 0b00_011;

    //int b3 = 0b_000111; //illegal


}
