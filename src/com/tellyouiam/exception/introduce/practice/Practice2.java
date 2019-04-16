package com.tellyouiam.exception.introduce.practice;

public class Practice2 {
    public static void main(String[] args) throws ArithmeticException {
        //This case you're not allowed to see declaration of ArithmeticException, you should add throws
        // ArithmeticException and then go to declaration (Ctrl + B) to see that

        /**
         *  Runtime Exception
        * */

        int value = 10 / 0;
        System.out.println(value);
    }
}
