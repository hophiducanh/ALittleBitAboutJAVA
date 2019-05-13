package com.tellyouiam.exception.user.defined.custom.exception;

public class MyException extends Exception{
    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}
