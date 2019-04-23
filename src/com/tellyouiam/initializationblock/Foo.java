package com.tellyouiam.initializationblock;

public class Foo {
    private int i;
    private static int k;

    private Foo() {

    }

    //instance initializer block
    {
        //run's every time a new object is created
        i=20;
    }

    //static initializer block
    static{
        //run's only one time when the class is loaded
        k=18;
    }

    public static void main(String[] args) {
        System.out.println(k);
        System.out.println(new Foo().i);
    }
}
