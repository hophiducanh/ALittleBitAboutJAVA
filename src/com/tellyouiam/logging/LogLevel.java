package com.tellyouiam.logging;

import java.util.logging.Logger;

public class LogLevel {
    //Don't have log4j
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World");
    }
}
