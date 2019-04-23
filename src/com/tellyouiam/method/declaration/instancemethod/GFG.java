package com.tellyouiam.method.declaration.instancemethod;
/**
 * Instance method are methods which require an object of its class to be
 * created before it can be called. To invoked a instance method, we have to create an
 * Object of the class in within which it defined
 * */
public class GFG {
    public static void main(String[] args) {

        //create an instance of the class
        Foo ob = new Foo();

        //calling an instance method in the class 'Foo'
        ob.geek("GeeksforGeeks");
        System.out.println(ob.name);
    }
}
