package com.tellyouiam.enums.outsideclass.declaration;

public class CoffeeTest {
    public static void main(String[]args){
        Coffee drink = new Coffee();
        //drink,size nghĩa là trong Coffee có khai báo enum
        drink.size = CoffeeSize.BIG;
    }
}
