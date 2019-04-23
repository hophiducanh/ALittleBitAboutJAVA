package com.tellyouiam.initializationblock;

public class Test {
    //https://stackoverflow.com/questions/1355810/how-is-an-instance-initializer-different-from-a-constructor
    static{
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
    }

}
