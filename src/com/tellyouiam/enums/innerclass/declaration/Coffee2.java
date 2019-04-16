package com.tellyouiam.enums.innerclass.declaration;

/**
 * Enum không thể khai báo trong method
* */

class Coffee2 {
    CoffeeSizeSize size;
    //Enum khai báo trong Class (inner class)
    /**
     *  The most important thing to remember is that enums are
     * not Strings or ints! Each of the enumerated CoffeeSize values is actually an instance of CoffeeSize.
     * In other words, BIG is of type CoffeeSize. Think of an enum as a kind of class that looks something (but
     * not exactly) like this
    * */
    enum CoffeeSizeSize { BIGBIG, HUGEHUGE, LARGE }
}
