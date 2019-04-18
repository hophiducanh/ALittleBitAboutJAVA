package com.tellyouiam.interfaces.multiple.inheritance;

public class TestClass implements TestExtendsInterface {

    @Override
    public void testMethod() {

    }

    @Override
    public void B() {

    }

    @Override
    public void A() {

    }

    public static void main(String[] args) {
        InterfaceA intera = new TestClass();
        intera.testMethod(); // the same implementation
        intera.A();
        InterfaceB interb = new TestClass();
        interb.testMethod(); //the same implementation
        interb.B();
    }
}
