package com.tellyouiam.string.format;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatSwaggerAPITool {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        scanner.forEachRemaining(System.out::println);
//        StringBuilder input = new StringBuilder();
//        while (scanner.hasNext()) {
//            input.append(scanner.nextLine()).append("\n");
//            if (scanner.nextLine().contains("*/")) {
//                break;
//            }
//        }

        String input = "";
        String result = input.toString().replaceAll("/\\*\\*\n", "");
        result = result.replaceAll("\\*/", "");
        result = result.replaceAll("(?m)^(\\s+)\\*\\s", "");
        Matcher atSignMatcher = Pattern.compile("(@(\\w)+(?= ))").matcher(result);
        if (atSignMatcher.find()) {
            result = result.replaceAll("(@(\\w)+(?= ))", "**$1**");
        }
        result = result.replaceAll("(\\{\\w+})", "`$1`");
        result = result.replaceAll("(^.+@.+$)", "$1\n");
        System.out.println(result);
    }
}
