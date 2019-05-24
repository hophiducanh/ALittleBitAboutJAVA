package com.tellyouiam.stdin.stdout;
/**
 * System.in.read() takes no arguments and returns an integer,
 * which has led some to believe that System.in.read() returns user-entered integer numbers.
 * To clarify, System.in.read() either returns a key's 7-bit ASCII code (if the standard input device
 * is set to the keyboard) or an 8-bit byte from a file (if the standard input device has been redirected from the keyboard to a file).
 * In either case, System.in.read() converts the code to a 32-bit integer and returns the result.
 * */
public class StandardInput {
    public static void main(String[] args) throws java.io.IOException{
        int ch;
        System.out.println("Enter some text: ");
        while ((ch = System.in.read()) != '\n')
            System.out.println((char) ch);
    }
}
//https://www.javaworld.com/article/2075069/core-java-the-ins-and-outs-of-standard-input-output.html
