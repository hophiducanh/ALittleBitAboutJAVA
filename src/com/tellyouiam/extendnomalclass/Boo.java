package com.tellyouiam.extendnomalclass;

public class Boo extends Foo {

    //Chỉ bắt buộc phải override khi kế thừa abstract class, còn nếu không kế thừa abstract class thì điều đó không
    //thực sự cần thiết
    void A() {
        System.out.println(a);
    }

}
