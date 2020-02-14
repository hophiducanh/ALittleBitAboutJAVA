package com.tellyouiam.variable.argument;

public class ArgumentParameter {

    // parameters: The things in the method’s signature ( a method signature is part of the method declarationa.
    // It's the combination of the method name and the parameter list.)that indicate what the method must receive
    // when it’s invoked

    /**
     * here method signature is doStuff(String a, int b)
     * */
    private static void doStuff(String a, int b) {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        //doStuff inside main method (static method) coz void doStuff() must be static method.

        //argument: The things you specify between the parentheses when you're invoking a method
        doStuff("a", 2);
    }
}
