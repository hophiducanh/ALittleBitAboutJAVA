package com.tellyouiam.method.declaration.instancemethod;
/*
 * Memory allocation: These methods themselves are stored in Permanent Generation space of heap
 * but the parameters (arguments passed to them) and their local variables and the value to be returned are allocated in stack.
 * They can be called within the same class in which they reside or from the different classes defined either in the same package
 * or other packages depend on the access type provided to the desired instance method.
 * */

/**
 * Important Points:
 *
 * Static method(s) are associated to the class in which they reside i.e.
 * they can be called even without creating an instance of the class i.e ClassName.methodName(args).
 * They are designed with aim to be shared among all Objects created from the same class.
 * Static methods can not be overridden. But can be overloaded since they are resolved using static binding by compiler at compile time.
 * */
class Foo {
    String name = "";

    //Instance method to be called within the same class or from a
    //another class defined in the same package or in difference package
    void geek(String name) {
        this.name = name;
    }
}
