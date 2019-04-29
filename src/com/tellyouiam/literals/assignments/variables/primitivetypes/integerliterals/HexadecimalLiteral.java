package com.tellyouiam.literals.assignments.variables.primitivetypes.integerliterals;

/**
 * Hexadecimal (hex for short) numbers are constructed using 16 distinct
 * symbols. Because we never invented single-digit symbols for the numbers 10 through 15, we use
 * alphabetic characters to represent these digits. Counting from 0 through 15 in hex looks like this:
 * 0 1 2 3 4 5 6 7 8 9 a b c d e f
 * Java will accept uppercase or lowercase letters for the extra digits (one of the few places Java is not
 * case sensitive!). You are allowed up to 16 digits in a hexadecimal number, not including the prefix 0x (or
 * 0X) or the optional suffix extension L
 * */

public class HexadecimalLiteral {
    public static void main(String[] args) {
        int x = 0X0001; //x = 1
        int y = 0x7fffffff; //y = 2147483647
        int z = 0xDeadCafe; //z = -559035650
        System.out.println("x = " + x + " y = " + y + " z = " + z);

        //Don’t be misled by changes in case for a hexadecimal digit or the x preceding it. 0XCAFE and 0xcafe
        //are both legal and have the same value

        /**
         * All four integer literals (binary, octal, decimal, and hexadecimal) are defined as int by default, but
         * they may also be specified as long by placing a suffix of L or l after the number:
         * long jo = 110599L;
         * long so = 0xFFFFl; // Note the lowercase ‘l’
         * */
    }
}
