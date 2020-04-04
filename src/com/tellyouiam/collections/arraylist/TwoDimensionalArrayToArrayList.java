package com.tellyouiam.collections.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDimensionalArrayToArrayList {
    public static void main(String[] args) {
        String[][] data = {{"Apple", "Banana"}, {"Pork", "Chicken"}, {"Carrots", "Tomato"} };

        List<String> list = Arrays.stream(data)  //'array' is two-dimensional
                .flatMap(Arrays::stream)
                .skip(1)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
