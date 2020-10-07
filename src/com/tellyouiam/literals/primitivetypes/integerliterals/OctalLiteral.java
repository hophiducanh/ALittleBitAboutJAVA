package com.tellyouiam.literals.primitivetypes.integerliterals;

/**
 * Octal integers use only the digits 0 to 7. In Java, you represent an integer in octal form
 * by placing a zero in front of the number
 *
 * */

public class OctalLiteral {
    public static void main(String[] args) {
        int six = 06;       //Equal to decimal 6
        int seven = 07;     //Equal to decimal 7
        int eight = 010;    //Equal to decimal 8
        int night = 011;    //Equal to decimal 9
        System.out.println("Octal 010 = " + eight);
    }
}

//You can have up to 21 digits in an octal number, not including the leading 0. If we run the preceding
//program, it displays the following:
//Octal 010 = 8
