package com.tellyouiam.initializationblock.staticblock;

/**
 * Instance initializers are a useful alternative to instance variable initializers whenever:
 *
 * initializer code must catch exceptions, or
 *
 * perform fancy calculations that can't be expressed with an instance variable initializer.
 *
 * or
 *
 * Instance initializers are also useful in anonymous inner classes, which can't declare any constructors at all. (docs)
 *
 * */
public class StaticBlock {
    private static final int widgets;

    static {
        //trong static block hay instance block có thể dùng try catch
        int first = Widgets.getFirstCount();
        int second = Widgets.getSecondCount();
        // Imagine more complex logic here which really used first/second
        widgets = first + second;
    }
}
