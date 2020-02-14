package com.tellyouiam.binding.dynamicbinding;

//See more in package polymorphism
//https://hoclaptrinh.vn/tutorial/hoc-java/gan-ket-tinh-va-gan-ket-dong-dynamic-binding-trong-java
//Khi kiểu của đối tượng được quyết định tại runtime thì đó là gắn kết động (Dynamic Binding).
public class DynamicBinding {
    static class SuperClass
    {
        void print()
        {
            System.out.println("print in superclass.");
        }
    }

    public static class SubClass extends SuperClass
    {
        @Override
        void print()
        {
            System.out.println("print in subclass.");
        }
    }

    /**
     * Polymorphic method invocations apply only to instance methods. You can always refer to an object with a more general
     * reference variable type (a superclass or interface), but at runtime, the ONLY things that are dynamically selected based on the
     * actual object (rather than the reference type) are instance methods. Not static methods. Not variables. Only overridden
     * instance methods are dynamically invoked based on the real OBJECT’s type.
     * */
    // Reference type la superclass va object type la subclass
    public static void main(String[] args)
    {
        SuperClass A = new SuperClass();
        SuperClass B = new SubClass();
        A.print();//print in superclass.
        B.print();//print in subclass.
    }

    /**
     * Here the output differs. But why? Let’s break down the code and understand it thoroughly.
     *
     * Methods are not static in this code.
     * During compilation, the compiler has no idea as to which print has to be called since compiler goes only by
     * referencing variable not by type of object and therefore the binding would be delayed to runtime and therefore
     * the corresponding version of print will be called based on type on object.
     * */

    /**
     * Important Points
     *
     * private, final and static members (methods and variables) use static binding while for virtual methods
     * (In Java methods are virtual by default) binding is done during run time based upon run time object.
     * Static binding uses Type information for binding while Dynamic binding uses Objects to resolve binding.
     * Overloaded methods are resolved (deciding which method to be called when there are multiple methods with same name)
     * using static binding while overridden methods using dynamic binding, i.e, at run time.
     * */
}
