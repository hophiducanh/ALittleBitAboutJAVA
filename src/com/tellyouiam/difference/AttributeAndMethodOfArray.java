package com.tellyouiam.difference;

/**
 * Arrays have an attribute (not a method) called length. You may encounter questions in the
 * exam that attempt to use the length() method on an array or that attempt to use the length
 * attribute on a String. Both cause compiler errors–consider these, for example:
 * */

public class AttributeAndMethodOfArray {

    public static void main(String[] args) {
        String x = "test";
        System.out.println(x.substring(1, 3)); //es because argument 1 is zero-based, argument 2 is one-based
//        System.out.println(x.length);

        System.out.println(x.length()); //cuz String is class -> length is method

        String [] y = new String[3];
        //System.out.println(y.length());

        System.out.println(y.length);
    }
}
