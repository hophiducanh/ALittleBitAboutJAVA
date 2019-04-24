package com.tellyouiam.overriding;

class Horse extends Animal {
    /**
     * The overriding method cannot have a more restrictive access modifier than the method being
     * overridden (for example, you can’t override a method marked public and make it protected).
     * */

    // overriding method with more accessibility
    public void eat() {
        System.out.println("Horse eating");
    }
}
