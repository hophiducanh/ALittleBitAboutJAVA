package com.tellyouiam.performance.pitfall;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i + 1);
        }
        map.put(1, 2);
        map.put(2, 3);

        long start = System.nanoTime();
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start));

        System.out.println("*********************************************");

        long startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        long endTime = System.nanoTime();
        System.out.println("Elapsed time: " + (endTime - startTime));
    }
}
