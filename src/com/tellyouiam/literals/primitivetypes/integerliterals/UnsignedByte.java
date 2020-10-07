package com.tellyouiam.literals.primitivetypes.integerliterals;

public class UnsignedByte {
    public static int convertBytesToUnsignedBytes(Byte x) {
        // auto cast to int
        return x & 0xFF;

        // explicit cast
        // return ((int) x) & 0xFF;
    }
    public static void main(String[] args) {
        byte input = (byte) -2;
        System.out.println(input);

        System.out.println(convertBytesToUnsignedBytes(input)); // 254

        // Java 8
        System.out.println(Byte.toUnsignedInt(input));

        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(254));
    }
}
