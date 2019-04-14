package com.tellyouiam.access_modifiers.protectedmodifier.other;

public class Neibor {
    public static void main(String[] args) {
        Child child = new Child();
        //Cho dù cùng package cùng với Child nhưng không thể truy cập biến x do protected,
        //nếu x variable ở Parent là public thì truy cập được

        //System.out.println(child.x);
    }
}
