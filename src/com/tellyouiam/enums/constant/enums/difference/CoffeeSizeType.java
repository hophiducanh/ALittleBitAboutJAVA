package com.tellyouiam.enums.constant.enums.difference;

import com.tellyouiam.enums.constant.enums.difference.enumeratelist.PlayerType;

/**
 *  The most important thing to remember is that enums are
 * not Strings or ints! Each of the enumerated CoffeeSize values is actually an instance of CoffeeSize.
 * In other words, BIG is of type CoffeeSize. Think of an enum as a kind of class that looks something (but
 * not exactly) like this
 * */
public class CoffeeSizeType {
    //Notice how each of the enumerated values, BIG, HUGE, and OVERWHELMING, is an instance of type
    //CoffeeSize. They’re represented as static and final, which, in the Java world, is thought of as a
    //constant. Also notice that each enum value knows its index or position—in other words, the order in
    //which enum values are declared matters
    public static final CoffeeSizeType BIG = new CoffeeSizeType("BIG", 0);
    public static final CoffeeSizeType HUGE = new CoffeeSizeType("HUGE", 1);
    public static final CoffeeSizeType OVERWHELMING = new CoffeeSizeType("OVERWHELMING", 2);

    private CoffeeSizeType(String enumName, int index) {}

    public static void main(String[] args) {
//        System.out.println(CoffeeSizeType.BIG);
        System.out.println(PlayerType.WARRIOR.name());
    }
}
