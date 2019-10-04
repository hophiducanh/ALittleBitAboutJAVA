package com.tellyouiam.interfaces.interfacedeclaration.staticinterfacemethod;

public interface StaticIface {
    static int  m1() {
        return 42;
    }
    public static void m2() {
        System.out.println("static keyword");
    }
//    final static void m3() {;}  //find not allowed inheritance
//    abstract static void m4() {;} //abstract not allowed, abstract don't have method body
//    static void m5(); //nonabstract -> need a method body (Lưu ý đây khai báo static trong interface java8inaction)
}
