package com.tellyouiam.loops;

public class LoopPitfall {
    public static void main(String[] args) {
        int count = 0;
        //Integer.MAX_VALUE + 1 = Integer.MIN_VALUE
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            count++;
        }
        //0x7fffffff: INTEGER.MAX_VALUE in unsigned representation
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.parseInt(Integer.toBinaryString(0x7fffffff), 2));
        System.out.println(Integer.toString(Integer.MAX_VALUE, 2));
        System.out.println(count);
    }
}
