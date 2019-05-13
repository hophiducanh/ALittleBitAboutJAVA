package com.tellyouiam.loops;

public class LabeledStatement {
    public static void main(String[] args) {
        outer: //outer abel
        for (int i = 0; i<2; i++) {
            for (int j=0; j <50; j++) {
                System.out.println("Hello");
                continue outer; //continue label
            }
            System.out.println("outer");
        }
        System.out.println("Good-bye");
    }
}
