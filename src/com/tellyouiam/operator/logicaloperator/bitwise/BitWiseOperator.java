package com.tellyouiam.operator.logicaloperator.bitwise;

public class BitWiseOperator {
    public static void main(String[] args) {

        // 6: 0110, 8: 01000
        byte b1 = 6 & 8; //Binary AND Operator copies a bit to the result if it exists in both operands.

        // 7: 0111, 9: 01001
        byte b2 = 7 | 9; //Binary OR Operator copies a bit if it exists in either operand.

        //5: 0101, 4: 0100
        byte b3 = 5 ^ 4; //Binary XOR Operator copies the bit if it is set in one operand but not both.

        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
