package com.tellyouiam.staticdeclaration;

public class OuterClass {
    //static nested class (can't mark for top-level class)
    static class A {}

    private void display() {
        //Can't mark static for local variable
        int num = 23;
        class InnerClass{

            //method local inner class
            //can't mark static for method local inner class
            private void print() {
                System.out.println("This is method inner class " + num);
            }
        }
        InnerClass obj = new InnerClass();
        obj.print();
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
