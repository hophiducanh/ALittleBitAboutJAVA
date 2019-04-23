package com.tellyouiam.initializationblock.staticblock;

public class NonStaticBlock {
    private static final int widgets = getWidgets();

    private static int getWidgets() {
        int first = Widgets.getFirstCount();
        int second = Widgets.getSecondCount();
        // Imagine more complex logic here which really used first/second
        return first + second;
    }
}
