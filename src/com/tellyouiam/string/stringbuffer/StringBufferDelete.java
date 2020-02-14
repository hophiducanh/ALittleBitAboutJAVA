package com.tellyouiam.string.stringbuffer;

public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer str4 = new StringBuffer("Hello World, good morning everyone!");
        str4.delete(6, 11);
        System.out.println(str4); //delete characters from index 6 to 11
    }
}
