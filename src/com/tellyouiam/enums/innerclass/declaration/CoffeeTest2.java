package com.tellyouiam.enums.innerclass.declaration;

/**
 * The key points to take away from these examples are that enums can be declared as their own class or
 * enclosed in another class, and that the syntax for accessing an enum’s members depends on where the
 * enum was declared.
* */
public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();
        //Truy cập giá trị Enum inner class
        drink.size = Coffee2.CoffeeSizeSize.BIGBIG;
    }
}
