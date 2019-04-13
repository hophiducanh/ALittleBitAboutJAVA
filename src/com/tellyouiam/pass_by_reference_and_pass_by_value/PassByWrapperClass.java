package com.tellyouiam.pass_by_reference_and_pass_by_value;

public class PassByWrapperClass {
    private static void  modifyWrappers (Integer x, Integer y) {
        x = new Integer(11);
        y =  new Integer(111);
    }

    public static void main(String[] args) {
        Integer obj1 = new Integer(69);
        Integer obj2 = new Integer(96);
        System.out.print("Values of obj1 & obj2 before wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
        modifyWrappers(obj1, obj2);
        System.out.print("Values of obj1 & obj2 after wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
    }
}
