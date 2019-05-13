package com.tellyouiam.loops;

public class LabeledWhileLoop {
    public static void main(String[] args) {
        int age = 1;
        outer: while (age <= 21) {
            age++;
            while (age == 16) {
                System.out.println("Get your diver's license");
                continue outer;
            }
            System.out.println("Another year");
        }
    }
}
