package com.tellyouiam.overriding.demo;

public class Main {
    public static void main(String[] args)
    {
        //If a Parent type reference refers to Parent object, then Parent's show() is called.
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM
        //Xem thêm về RUN TIME POLYMORPHISM ở package polymorphism và binding
        Parent obj2 = new Child();
        obj2.show();
    }
}
