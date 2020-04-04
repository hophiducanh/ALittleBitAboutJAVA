package com.tellyouiam.java8.substitude.traditional.loop;

import java.util.stream.IntStream;

public class TwoDimensionalArray {
    public static void iterateAction(int i, int j, String data) {
        System.out.println(i + " " + " " + j + " " + data);
    }

    public static void main(String[] args) {
        String[][] data = {{"Apple", "Banana"}, {"Pork", "Chicken"}, {"Carrots", "Tomato"} };

        IntStream.range(0, data.length)
                .forEach(i -> IntStream.range(0, data[i].length)
                        .forEach(j -> System.out.println(data[i][j])));

        IntStream.range(0, data.length)
                .forEach(i -> IntStream.range(0, data[i].length)
                        .forEach(j -> {
                            iterateAction(i, j, data[i][j]);
                        })
                );


    }
}
