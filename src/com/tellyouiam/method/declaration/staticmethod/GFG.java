package com.tellyouiam.method.declaration.staticmethod;

/**
 * Memory Allocation: They are stored in Permanent Generation space of heap as they are associated to the class
 * in which they reside not to the objects of that class.
 * But their local variables and the passed argument(s) to them are stored in the stack.
 * Since they belong to the class so they can be called to without creating the object of the class.
 * */

public class GFG {
    public static void main(String[] args) {
        //Accessing the static method geek() and field by class name itself
        Geek.geek("Duc Anh");
        System.out.println(Geek.geekName);

        // Accessing the static method geek() by using Object's reference.
        Geek obj = new Geek();
        obj.geek("Ho Anh");
        System.out.println(obj.geekName);
    }
}

/**
 * Static method(s) are associated to the class in which they reside i.e.
 * they can be called even without creating an instance of the class i.e ClassName.methodName(args).
 * They are designed with aim to be shared among all Objects created from the same class.
 * Static methods can not be overridden.
 * But can be overloaded since they are resolved using STATIC BINDING by compiler at compile time.
 * */
