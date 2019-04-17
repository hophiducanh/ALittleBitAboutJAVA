package com.tellyouiam.finalkeyword.declaration;

/**
 * Biến final không thể thay đổi được, đó là đương nhiên. Nhưng trường hợp này chúng ta có thể thay đổi biến tham
 * chiếu (final reference variable) v
 * */
public class FinalClass {
    public static void main(String[] args)
    {
        final ChildClass objChildClass = new ChildClass();
        objChildClass.UserId = 155;
        //objChildClass = new ChildClass();
        System.out.println(objChildClass.UserId);

        objChildClass.UserId = 200;
        System.out.println(objChildClass.UserId);
        System.out.println(objChildClass.UserId);
    }
}
