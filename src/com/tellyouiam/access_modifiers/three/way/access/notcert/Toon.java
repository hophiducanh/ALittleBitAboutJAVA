package com.tellyouiam.access_modifiers.three.way.access.notcert;

public class Toon {
    public static void main(String[] args) {
        //Có 3 cách để truy cập một phương thức
        // Cách 3: Gọi một class sử dụng tham chiếu của class bằng dot operator (.)
        Cloo c = new Cloo();
        System.out.println(c.doRooThings());

        //Only static variables or methods can be accessed using class name.
        //Code that is outside the object's class must use an object reference or expression,
        //followed by the dot (.) operator, followed by a simple field name or method as in
        //objectReference.methodName(argumentList);

    }
}
