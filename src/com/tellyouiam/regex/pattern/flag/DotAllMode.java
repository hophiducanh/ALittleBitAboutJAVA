package com.tellyouiam.regex.pattern.flag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotAllMode {
    public static void main(String[] args) {
        Matcher defaultMatcher = Pattern.compile("The.*sentence")
                .matcher("The is \n one sentence");
        if (defaultMatcher.find()) { //not match
            System.out.println(defaultMatcher.group());
            System.out.println(defaultMatcher.groupCount());
        }

        Matcher dotallMatcher = Pattern.compile("The.*sentence", Pattern.DOTALL)
                .matcher("The is \n one sentence");
        if (dotallMatcher.find()) {
            System.out.println(dotallMatcher.group());
            System.out.println(dotallMatcher.groupCount());
        }
    }
}
