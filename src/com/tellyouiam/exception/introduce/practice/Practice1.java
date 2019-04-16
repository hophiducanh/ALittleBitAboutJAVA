package com.tellyouiam.exception.introduce.practice;

public class Practice1 {

    public static void main(String[] args) {
        int i = Integer.parseInt("10");

        //Ctrl + B go to declaration will see:
        //public static float parseFloat(String s) throws NumberFormatExceptionExample ---> Ctrl + B to see declaration of NumberFormatExceptionExample --->
        //IllegalArgumentException ----> RuntimeException (Hence i have conclusion: this is a runtime exception or unchecked exception)
        float f = Float.parseFloat("4.5a");

        System.out.println(i);
        System.out.println(f);
    }
}
