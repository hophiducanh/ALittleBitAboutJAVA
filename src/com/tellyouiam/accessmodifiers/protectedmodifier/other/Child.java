package com.tellyouiam.accessmodifiers.protectedmodifier.other;

import com.tellyouiam.accessmodifiers.protectedmodifier.certification.Parent;

public class Child extends Parent {

    public void testId() {
     System.out.println("x is: " + x);
        //We can't access x using Parent class reference như class Toon trong three.way.access
//        Parent p = new Parent();
//
//        System.out.println("X in parent is" + p.x);
    }
}
