package com.tellyouiam.innerclasses.methodlocal;

public class OuterClass {

    //static nested class
    static class A {}

    public void display() {
        int num = 23;
         class Inner{
            //method local inner class
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
