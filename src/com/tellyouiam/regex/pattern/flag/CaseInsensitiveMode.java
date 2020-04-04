package com.tellyouiam.regex.pattern.flag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInsensitiveMode {
    public static void main(String[] args) {
        String text = "HELLO";
        String str = "Apple CT: AppleLTD";
        Matcher ctMatcher = Pattern.compile(Pattern.quote("ct"), Pattern.CASE_INSENSITIVE).matcher(str);
        if (ctMatcher.find()) {
            System.out.println("Matcher find");
        }

        System.out.println("foo".matches(".*")); // true
        System.out.println("foo".matches(Pattern.quote(".*"))); // false
        System.out.println(".*".matches(Pattern.quote(".*"))); // true

        if (text.matches("(?-i)hello")) {
            System.out.println("Case sensitive");
        } else if (text.matches("(?i)hello")) {
            System.out.println("Case insensitive");
        }
        System.out.println(Pattern.quote("abc"));

        System.out.println();
        System.out.println("*******************LOGIC BIG**********************");

        /* The default case sensitive matching*/
//        Matcher defaultSensitiveMatcher = Pattern.compile("\\b[a-z]+\\b")
//                .matcher("Stew Pasta Twinkies");
        Matcher defaultSensitiveMatcher = Pattern.compile("\\bstew+\\b")
                .matcher("Stew Pasta Twinkies");

        /* Enable case-insensitive matching*/
        while (defaultSensitiveMatcher.find()) { //false
            System.out.println("Sensitive: " + defaultSensitiveMatcher.group());
        }

//        Matcher insensitiveMatcher = Pattern.compile("\\b[a-z]+\\b", Pattern.CASE_INSENSITIVE)
//                .matcher("Stew Pasta Twinkies");
        Matcher insensitiveMatcher = Pattern.compile("\\bSTEW+\\b", Pattern.CASE_INSENSITIVE)
                .matcher("Stew Pasta Twinkies");
        while (insensitiveMatcher.find()) {
            System.out.println("Insensitive: " + insensitiveMatcher.group());
        }

        /* Using embedded flag.*/
        Pattern.compile("(?i)\\b[a-z]+\\b")
                .matcher("Stew Pasta Twinkies")
                .find();//matches:  'Stew' at 0-4, 'Pasta' at 5-10, 'Twinkies' at 11-19


        int i = 0;
        while (true) {
            i++;
            System.out.println("i :" + i);
            if (i == 1)
                break;
        }
    }
}
