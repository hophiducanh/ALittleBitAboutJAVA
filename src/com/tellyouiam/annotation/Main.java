package com.tellyouiam.annotation;

import com.sun.istack.internal.NotNull;

public class Main {
    public static int add (@NotNull int a, @NotNull String b) {
        return a;
    }
    public static void main(String[] args) {
        System.out.println(add(4, null));
    }
}
