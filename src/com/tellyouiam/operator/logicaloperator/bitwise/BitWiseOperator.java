package com.tellyouiam.operator.logicaloperator.bitwise;

public class BitWiseOperator {
    //https://oscarliang.com/what-s-the-use-of-and-0xff-in-programming-c-plus-p/
    public static void main(String[] args) {

        // 6: 0110, 8: 01000 >> 00000000
        byte b1 = 6 & 8; //Binary AND Operator copies a bit to the result if it exists in both operands.
        //It returns bit by bit AND of input values, i.e, if BOTH bits are 1, it gives 1, else it gives 0.


        // 7: 0111, 9: 01001
        byte b2 = 7 | 9; //Binary OR Operator copies a bit if it exists in either operand.
        //It returns bit by bit OR of input values, i.e, if EITHER of the bits is 1, it gives 1, else it gives 0.

        //5: 0101, 4: 0100
        byte b3 = 5 ^ 4; //Binary XOR Operator copies the bit if it is set in one operand but not both.
        // It returns bit by bit XOR of input values, i.e, if corresponding bits are different, it gives 1, else it gives 0.

        byte b4 = ~0; //Bitwise Complement
        System.out.println(b4);

        // The java.lang.Integer.toBinaryString() method returns a string representation of the integer argument as an unsigned integer in base 2
        // 0xFF is 255, or 11111111 (max value for an unsigned byte). 0x100 is 256, or 100000000
        // We need added to 256 if we want to represent int as 8bit long binary.
        // (because 256 is 9 bit long with 1 (leading bit) follow by 8 zero number)
        // Byte value only affect in 8 bit long (any byte value representation).
        // https://stackoverflow.com/a/17496691/10393067
        String s1 = Integer.toBinaryString((b1 & 0xFF) + 256).substring(1); //100000000 + 1 = 100000001.substring() >> 00000001
        String s2 = Integer.toBinaryString((b2 & 0xFF) + 0x100).substring(1);
        String s3 = Integer.toBinaryString((b3 & 0xFF) + 256).substring(1);

        String ss1 = Integer.toBinaryString(b1 & 0xFF).substring(1); //1
        String ss2 = Integer.toBinaryString(b2 & 0xFF).substring(1);
        String ss3 = Integer.toBinaryString(b3 & 0xFF).substring(1);
        System.out.println("SS1: " + ss1 + " " + ss2 + " " + ss3);

        String s11 = Integer.toBinaryString((b1 & 0xFF) + 256);
        System.out.println(b1 + " " + b2 + " " + b3);
        System.out.println("S1: " + s1 + " " + s2 + " " + s3);
        System.out.println("S1 vs S11 " + s1 + "      " + s11);

        // Well, 0xff is the hexadecimal number FF which has a integer value of 255.
        // And the binary representation of FF is 00000000000000000000000011111111 (under the 32-bit integer).
        String s4 = Integer.toBinaryString(0xFF).substring(1);
        System.out.println(s4);

        String s5 = Integer.toBinaryString(5);
        String s6 = Integer.toBinaryString(-5);
        String s7 = Integer.toBinaryString(-4);
        String s8 = Integer.toBinaryString(-3);
        String s9 = Integer.toBinaryString(-2);
        String s10 = Integer.toBinaryString(-1);
        System.out.println(" 5: " + s5);
        System.out.println("-5: " + s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
    }
}
