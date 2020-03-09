package com.tellyouiam.string.stringbuilder;

public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("WelcomeGeeks");

        // print string
        System.out.println("String = "
                + str.toString());

        StringBuilder strReturn = str.replace(1,7, "OK");

        // print string
        System.out.println("After Replace() String = "
                + strReturn.toString());
    }
}
