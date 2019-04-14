package com.tellyouiam.access_modifiers.book;

import com.tellyouiam.access_modifiers.cert.*;
//Có 3 cách để truy cập một phương thức
//Cách 1: gọi một phương thức được khai báo cùng một class
public class Goo {
    public static void main(String[] args) {
        Sludge o = new Sludge();
        o.testId();
    }

}
