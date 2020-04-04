package com.tellyouiam.string.practice;

public class TwoDimensionalArrStringBuilderConverter {
    public static StringBuilder converter (String[][] arr) {
        StringBuilder builder = new StringBuilder();
        for (String[] strArr : arr) {
            for (String str : strArr) {
                builder.append(str).append(",");
            }
        }
        return builder;
    }

    public static void main(String[] args) {
        String[][] arr = {
                {"Ho", "Anh"},
                {"Log", "Basex"}
        };

        System.out.println(converter(arr).toString());
    }
}
