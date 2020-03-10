package com.tellyouiam.string.stringbuilder;

public class InsertMethod {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Logbasex");
        builder.insert(3, "XXX");
        System.out.println(builder);

    }
}
