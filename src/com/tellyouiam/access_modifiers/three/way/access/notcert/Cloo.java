package com.tellyouiam.access_modifiers.three.way.access.notcert;

import com.tellyouiam.access_modifiers.three.way.access.cert.Roo;

public class Cloo extends Roo {
    //Có 3 cách để truy cập một phương thức
    //Cách 2: Gọi một phương thức được thừa kế
    //Gọi một phương thức mà không cần dùng (.) dot operator tức là phương thức đó thuộc lớp đó (implicitly)
    public void testCloo() {
        //Có thể dùng toán tử this ở đây.
        System.out.println(this.doRooThings());
    }
}
