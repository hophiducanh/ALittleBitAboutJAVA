package com.tellyouiam.import_statement;

//import use to save typing and easier to read
import java.util.ArrayList;

public class ImportStatement1 {
    public static void main(String[] args) {
        //ArrayList is shorthand of java.util.ArrayList
        //Both are the same
        ArrayList<String> a = new ArrayList<String>();
        java.util.ArrayList<String> a1 = new java.util.ArrayList<String>();
    }
}
