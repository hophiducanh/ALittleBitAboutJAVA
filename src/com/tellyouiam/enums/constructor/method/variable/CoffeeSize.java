package com.tellyouiam.enums.constructor.method.variable;

public enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16);

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;


    public int getOunces() {
        return ounces;
    }
}
