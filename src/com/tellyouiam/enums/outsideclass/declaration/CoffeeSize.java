package com.tellyouiam.enums.outsideclass.declaration;


/**
 * Access modifier can't be private or protected
* */

//declare Enum out of class
 enum
CoffeeSize {
    /**
     *  The most important thing to remember is that enums are
     * not Strings or ints! Each of the enumerated CoffeeSize values is actually an instance of CoffeeSize.
     * In other words, BIG is of type CoffeeSize. Think of an enum as a kind of class that looks something (but
     * not exactly) like this
     * */
    BIG, HUGE, OVERWHELMING
}


