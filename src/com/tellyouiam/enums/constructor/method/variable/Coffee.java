package com.tellyouiam.enums.constructor.method.variable;

import java.util.Arrays;

public class Coffee {
    private CoffeeSize size;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CoffeeSize.values()));

        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;

        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.OVERWHELMING;

        System.out.println(drink1.size.getOunces());
    }
}
