package com.tellyouiam.variable.declaration.kindofvariable.staticvariable.difference;

class Product {
    //These are also known as static member variables and
    // there's only one copy of that variable that is shared with all instances of that class.
    // If changes are made to that variable, all other instances will see the effect of the changes.
    private static int barcode;

    /**
     * Trong cùng một package nếu để public thay vì default sẽ phá vỡ nguyên tắc thiết kế của Java: Encapsulation
    * */

    //public int getBarcode() {
    //        return barcode;
    //    }
    int getBarcode() {
        return barcode;
    }

    void setBarcode(int value) {
        barcode = value;
    }



}
