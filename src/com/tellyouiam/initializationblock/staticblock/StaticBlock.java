package com.tellyouiam.initializationblock.staticblock;

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
