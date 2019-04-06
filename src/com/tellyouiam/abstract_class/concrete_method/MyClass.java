package com.tellyouiam.abstract_class.concrete_method;

  abstract class MyClass {
    // non-abstract method (concrete method)
    public void disp(){
        System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();
}
