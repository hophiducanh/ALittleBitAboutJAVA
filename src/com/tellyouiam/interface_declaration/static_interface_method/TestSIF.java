package com.tellyouiam.interface_declaration.static_interface_method;

public class TestSIF implements StaticIface{
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());

        new TestSIF().go();
    }

    void go () {
        System.out.println(StaticIface.m1());
    }
}
