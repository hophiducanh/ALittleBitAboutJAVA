package com.tellyouiam.accessmodifiers.protectedmodifier.certification;

public class Parent {
    //For a subclass outside the package, the protected member can be
    //accessed only through inheritance.
    //Nói đến protected là nói đến inheritance, nếu không có inheritance thì khác package cũng không truy cập được
    protected int x = 9;
}
