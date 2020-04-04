package com.tellyouiam.string.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetListStringFromSource {
    public static List<String> get(String path, boolean ignoreHeader) {
        List<String> data = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(new File(path));
                BufferedReader br = new BufferedReader(fileReader);
        ) {
            int count = 0;
            while (br.readLine() != null) {
                count++;
                if (ignoreHeader && count == 1)
                    continue;
                data.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        String path = "/home/logbasex/Desktop/data/POB-479-Wylie Dalziel Racing/submit/formatted-ownership.csv";
        get(path, true).forEach(System.out::println);
    }
}
