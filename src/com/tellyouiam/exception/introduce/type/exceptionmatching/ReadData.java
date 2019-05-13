package com.tellyouiam.exception.introduce.type.exceptionmatching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * If you have an exception hierarchy composed of a superclass exception and a number of subtypes, and
 * you’re interested in handling one of the subtypes in a special way but want to handle all the rest together,
 * you need write only two catch clauses.
 * When an exception is thrown, Java will try to find (by looking at the available catch clauses from the
 * top down) a catch clause for the exception type. If it doesn’t find one, it will search for a handler for a
 * supertype of the exception. If it does not find a catch clause that matches a supertype for the exception,
 * then the exception is propagated down the call stack. This process is called “exception matching.”
 * OCA SE 8 I Exam Guide 295.page
 * */

public class ReadData {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
            byte b[] = new byte[1000];
            raf.readFully(b, 0 , 1000);
        } catch (FileNotFoundException e) {
            //sout output chữ màu trắng, serr output chữ màu đỏ.
            System.err.println("File not found");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error");
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
