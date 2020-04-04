package com.tellyouiam.object;

import java.util.List;
import java.util.Objects;

public class CheckNullCollection {
    public static void main(String[] args) {
        List<Integer> i = null;

        if (Objects.isNull(i)) {
            System.out.println("Haha");
        }
    }
}
