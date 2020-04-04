package com.tellyouiam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    public static void test(String regex, String input) {
        test(regex, input, 0);
    }

    public static void test(String regex, String input, int flg) {
        System.out.println("---------------------");
        System.out.printf("Regex: '%s', Input: '%s'%n", regex, input);

        testMatches(regex, input);
        testFind(regex, input, flg);
        testReplaceAll(regex, input);
    }

    private static void testReplaceAll(String regex, String input) {
        System.out.printf("matcher.replaceAll(\"xyz\") => '%s'%n",
                Pattern.compile(regex).matcher(input).replaceAll("xyz"));
    }


    private static void testFind(String regex, String input, int flg) {
        Pattern pattern = Pattern.compile(regex, flg);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            String matchedValue = matcher.group();

            System.out.printf("Matched (Group zero) startIndex= %s, endIndex= %s, match= '%s'%n",
                    matcher.start(), matcher.end(), matchedValue);
            showGroupInformation(matcher);
        }
    }

    public static void showGroupInformation(Matcher matcher) {

        for (int i = 1; i <= matcher.groupCount(); i++) {
            System.out.printf("Group number: %s, " +
                            "Group matchedString: '%s',  start: %s, end: %s%n",
                    i, matcher.group(i), matcher.start(i), matcher.end(i));


        }

    }

    private static void testMatches(String regex, String input) {
        System.out.printf("matcher.matches() :  '%s':%n", Pattern.compile(regex)
                .matcher(input).matches());
    }
}
