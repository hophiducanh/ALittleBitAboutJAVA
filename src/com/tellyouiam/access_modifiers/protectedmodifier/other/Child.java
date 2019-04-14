package com.tellyouiam.access_modifiers.protectedmodifier.other;

import com.tellyouiam.access_modifiers.protectedmodifier.certification.Parent;

public class Child extends Parent {

    public void testId() {
     System.out.println("x is: " + x);
        //We can't access x using Parent class reference như class Toon trong three.way.access
//        Parent p = new Parent();
//
//        System.out.println("X in parent is" + p.x);
    }
}
