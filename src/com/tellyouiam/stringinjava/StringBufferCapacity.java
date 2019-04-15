package com.tellyouiam.stringinjava;

public class StringBufferCapacity {
    public static void main(String[] args) {
        //check default capacity of StringBuffer
        StringBuffer str6 = new StringBuffer();
        System.out.println(str6.capacity()); //16

        //pass amount of characters that StringBuffer can store initially
        StringBuffer str7 = new StringBuffer(30);
        System.out.println(str7.capacity()); // Kết quả in ra là 30

        StringBuffer str8 = new StringBuffer();
        //StringBuffer is pretty convenient. When I pass amount of characters exceed 16 characters, StringBuffer
        // auto increase capacity. This make StringBuffer flexible and memory usage is opimized
        str8.append("He! WorldDDDDDDDDD");
        System.out.println(str8.capacity());
    }
}
