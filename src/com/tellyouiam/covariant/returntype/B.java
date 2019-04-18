package com.tellyouiam.covariant.returntype;

class B extends A{

    //Bắt buộc phải override lại constructor từ class A
    B(String name) {
        super(name);
    }
}
