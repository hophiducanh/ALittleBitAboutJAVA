package com.tellyouiam.string.practice;

public class StringArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[]{" "," ","",""};
        String x = String.join(",",arr);
        System.out.println(x);
        if (x.matches("^([,\\s]+)$")) {
            System.out.println("Matches");
        }
    }
}
