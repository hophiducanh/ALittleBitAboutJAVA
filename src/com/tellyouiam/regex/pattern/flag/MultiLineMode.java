package com.tellyouiam.regex.pattern.flag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiLineMode {
    public static void main(String[] args) {
        Matcher defaultMatcher = Pattern.compile("T.*e")
                .matcher("The First line\nThe SecondLine");

        while (defaultMatcher.find()) {
            System.out.println("Default: " + defaultMatcher.group());
        }

        Matcher firstDefault = Pattern.compile("^T.*e")
                .matcher("The First line\nThe SecondLine");

        while (firstDefault.find()) {
            System.out.println("First: " + firstDefault.group());
        }

        Matcher secondDefault = Pattern.compile("^T.*e$")
                .matcher("The First line\nThe SecondLine");

        while (secondDefault.find()) {
            System.out.println("Second: " + secondDefault.group());
        }
    }
}
