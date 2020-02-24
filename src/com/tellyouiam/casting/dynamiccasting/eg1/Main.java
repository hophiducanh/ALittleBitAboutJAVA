package com.tellyouiam.casting.dynamiccasting.eg1;

public class Main {
    // https://www.superglobals.net/java-static-vs-dynamic-casting/

    // Let’s create a function that takes an arbitrary class and tries to cast the first argument to that type.
    // I’ll call this ‘dynamic’ casting since **IT’S NOT KNOWN AT COMPILE TIME.**
    // (Well it is written in the source code but in that Class<T> param any class can be passed.
    // We can program it to change on user input and so on… 🙂 ).
    public static <T> T dynamicCast(Object o, Class<T> clasz) {
        return clasz.cast(o);
    }

    public static void main(String[] args) {
        Object o = new SendMail();
        SendMail sameThing = dynamicCast(o, SendMail.class);
        sameThing.perform();
    }
}
