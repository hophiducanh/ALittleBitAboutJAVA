package com.tellyouiam.abstractclass.concretemethod.abstractmethod.concretemethod;

  abstract class MyClass {
    // non-abstract method (concrete method)
    public void disp(){
        System.out.println("Concrete method of parent class");
    }
    abstract public void disp2();
}
