package com.tellyouiam.interface_declaration.static_interface_method;

public interface StaticIface {
    static int  m1() {
        return 42;
    }
    public static void m2() {
        ;
    }
//    final static void m3() {;}  //find not allowed inheritance
//    abstract static void m4() {;} //abstract not allowed, abstract don't have method body
//    static void m5(); //nonabstract -> nead a method body
}
