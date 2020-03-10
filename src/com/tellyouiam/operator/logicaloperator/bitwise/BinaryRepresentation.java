package com.tellyouiam.operator.logicaloperator.bitwise;

public class BinaryRepresentation {
    public static String intToBinary(int n)
    {
        StringBuilder s = new StringBuilder();
        while (n > 0)
        {
            s.insert(0, ((n % 2) == 0 ? "0" : "1"));
            n = n / 2;
        }
        return s.toString();
    }
    public static void main(String[] args) {
        System.out.println(Integer.toString(5, 2));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(intToBinary(5));
    }
}
