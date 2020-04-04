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

        String input = "/**\n" +
                "     * @api {GET} /reminder/affirmation\n" +
                "     * @apiName GET List Reminder Affirmation.\n" +
                "     * @apiHeader\n" +
                "     * @apiHeaderExample\n" +
                "     * @apiParam {Integer} pageIndex\n" +
                "     * @apiParam {Integer} pageSize\n" +
                "     * @apiSuccessExample {json} Success-Response: HTTP/1.1 200 OK\n" +
                "     * {\n" +
                "     *     \"error\": null,\n" +
                "     *     \"responseData\": [\n" +
                "     *         {\n" +
                "     *             \"id\": 2,\n" +
                "     *             \"affirmation\": \"I will try my best\",\n" +
                "     *             \"reminderTemplateId\": 5\n" +
                "     *         },\n" +
                "     *         {\n" +
                "     *             \"id\": 1,\n" +
                "     *             \"affirmation\": \"The moment I witnessing, the future I'm coming.\",\n" +
                "     *             \"reminderTemplateId\": 2\n" +
                "     *         },\n" +
                "     *         {\n" +
                "     *             \"id\": 3,\n" +
                "     *             \"affirmation\": \"The moment I witnessing, the future I'm coming.\",\n" +
                "     *             \"reminderTemplateId\": 2\n" +
                "     *         }\n" +
                "     *     ],\n" +
                "     *     \"extraData\": null,\n" +
                "     *     \"successMessage\": null,\n" +
                "     *     \"warningMessage\": null\n" +
                "     * }\n" +
                "     */";
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
