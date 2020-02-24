package com.tellyouiam.casting.staticcasting;

public class Main {
    public static void main(String[] args) {
        // And casting a reference variable doesn’t touch the object it refers to, but only labels this object in another way,
        // expanding or narrowing opportunities to work with it.
        Object o = new SendMail();
        SendMail sendMail = (SendMail) o;
        sendMail.perform();
    }
}
