package com.tellyouiam.variable.argument;

public class VarargExample {
    static void display(String... values) {
        System.out.println("display method invoked ");

        for (String s: values) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        display(); //zero argument
        display("my", "name", "is", "varargs"); //four arguments
    }
}
