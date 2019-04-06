package com.tellyouiam.javac_and_classloader;
//javac_and_classloader main.java we have main.class file. Javac mean 'java compiler', transform to bytecode Java
public class Main {
    public static void main ( String arg2) {
        System.out.println("Hi, " + arg2);
    }

    static public void main (String[] args) {
        for(String s : args){
            System.out.println(s);
        }    }
}
