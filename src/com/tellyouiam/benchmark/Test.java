package com.tellyouiam.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

public class Test {
    @Benchmark
    public void init () {

    }

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }
}
