package com.tellyouiam.string.practice;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class LexicographicallyOrder {
    private static String compare(String A, String B) {
        int order = 0;

        int maxLength = Math.max(A.length(), B.length());
        int minLength = Math.min(A.length(), B.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < minLength) {
                if (A.charAt(i) == B.charAt(i)) {
                    continue;
                }

                if (A.charAt(i) < B.charAt(i)) {
                    order = -1;
                    break;
                } else {
                    order = 1;
                    break;
                }
            } else {
                if (A.length() > B.length()) {
                    order = 1;
                    break;
                } else {
                    order = -1;
                    break;
                }
            }
        }
        return order > 0 ? "Yes" : "No";
    }

    public static String capitalize(String A, String B) {
        return A.substring(0,1).toUpperCase().concat(A.substring(1)) +
                " " +
                B.substring(0,1).toUpperCase().concat(B.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(compare(A, B));
        System.out.println(capitalize(A, B));
    }
}
