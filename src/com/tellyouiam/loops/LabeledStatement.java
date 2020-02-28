package com.tellyouiam.loops;

public class LabeledStatement {
    public static void main(String[] args) {
        outer: //outer label
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("Hello");
                // when continue outer j++ is unreachable statement.
                continue outer; //continue label
            }
            System.out.println("outer");
        }
        System.out.println("Good-bye");
    }
}
