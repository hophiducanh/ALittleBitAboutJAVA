package com.tellyouiam.immutable_and_mutable;

public class MutablePractice {
    public static void main(String[] args) {

        long start = System.nanoTime();

        int n = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(String.valueOf(n));
        }

        String s = sb.toString();
        System.out.println(s);

        long finish = System.nanoTime();

        System.out.println(finish - start);//603400 nanosecond rõ ràng đã nhanh hơn thuật toán
        // dùng bên ImmutablePractice
    }
    //reference: https://blog.daovanhung.com/post/ban-da-thuc-su-hieu-mutable-va-immutable
}
