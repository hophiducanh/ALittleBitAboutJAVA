package com.tellyouiam.immutable_and_mutable;

public class ImmutablePractice {
    public static void main(String[] args) {

        long start = System.nanoTime();

        String s = "";
        int n = 10;
        for (int i = 0; i < n; ++i) {
            s = s + n;
        }
        System.out.println(s);

        long finish = System.nanoTime();

        long timeElapsed = finish - start;
        System.out.println(timeElapsed);//980804 nanosecond
        //Chúng ta có thể dùng mutable để cải thiện thuật toán này trong MutablePractice
    }
}
