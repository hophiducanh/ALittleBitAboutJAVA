package com.tellyouiam.constructor.privateconstructor.singletonclass;

public class Main {
    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of a.x = " + b.x);
        
        // If private constructor used, you can't initialize MySingleton instant .
        //MySingleton singleton = new MySingleton();
    }
}
