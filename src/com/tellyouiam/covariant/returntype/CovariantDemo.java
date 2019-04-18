package com.tellyouiam.covariant.returntype;

public class CovariantDemo {
    public static void main(String[] args) {
        // Reference of Class C
        C c;
        // pointing to class C
        c = new C();
        System.out.println("Value from class C " + c.getValue().name);
        // now pointing to class D
        c = new D();
        System.out.println("Value from class D " + c.getValue().name);
    }
}
