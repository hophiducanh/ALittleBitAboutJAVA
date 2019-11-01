package com.tellyouiam.operator.logicaloperator.bitwise;

/**
 * Difference between >> (Right Shift) and >>> (Unsigned Right Shift) in Java
 * */
public class RightShiftAndUnsignShift {
    public static void main(String[] args) {
        int number = -2; System.out.println(number);
        System.out.println("Before shift : " + Integer.toBinaryString(number));

        number = number >> 1; //shifting 1 right bit

        System.out.println(number);
        System.out.println("After shift : " + Integer.toBinaryString(number));

        //  If you look at carefully, here we are shifting only one bit using right shift operator (number >> 1),
        //  which means 0 at left most position from binary representation of -2 will be lost (marked with red color).
        //  Remember, int primitive is a 32 bit variable in Java and that's why we are seeing 32 bits here.
        //  From output you can see that right most zero is lost and a new bit with value 1 is added into left most position (marked with blue).
        //  Why 1? because it's a negative number and its MSB (MOST SIGNIFICANT BIT) or sign bit is 1. Since >> preserves sign, it is also known as right shift with sign extension.
       //  Read more: https://javarevisited.blogspot.com/2015/02/difference-between-right-shift-and.html#ixzz63vCC8sCS
    }
}
