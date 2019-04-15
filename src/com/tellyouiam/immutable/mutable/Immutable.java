package com.tellyouiam.immutable.mutable;

public class Immutable {
    //String is part of java.lang thus we don't need import to use
    //Initialize str1 varibale = "first"
    String str1 = new String("first");

    //Initialize str2 reference to str1
    String str2 = str1;

    //String is immutable, any manipulation on String as well as create new object
    //str1.concat("-second") will return a new String object which value is "first-second"
    {
        str1 = str1.concat("-second");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
    //The only way to call system.out method without main method is
    //declare in code block. But we can't execute this method. huhu

    public static void main(String[] args) {
        String str1 = new String("first");
        String str2 = str1;

        str1 = str1.concat("-second");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}
