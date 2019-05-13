package com.tellyouiam.exception.introduce.type.error;

/**
 * When Java calls methods, it puts parameters and local variables on the stack. After doing
 * this a very large number of times, the stack runs out of room and overfl ows. This is called a
 * StackOverflowError. Most of the time, this error occurs when a method calls itself.
 * */

public class DemoStackOverFlowError {
    private static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    public static void main(String[] args) {
        doNotCodeThis(1);
    }
    //Since the method calls itself, it will never end. Eventually, Java runs out of room on the
    //stack and throws the error. This is called infi nite recursion. It is better than an infi nite loop
    //because at least Java will catch it and throw the error. With an infi nite loop, Java just uses
    //all your CPU until you can kill it.
}
