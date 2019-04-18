package com.tellyouiam.interfaces.interfacedeclaration.staticinterfacemethod;

public class TestSIF implements StaticIface{
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());

        new TestSIF().go();
    }

    void go () {
        System.out.println(StaticIface.m1());
    }
}
