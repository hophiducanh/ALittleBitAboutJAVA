package com.tellyouiam.string.stringbuffer;

/**
 * Many of the exam questions covering this chapter’s topics use a tricky bit of Java syntax
 * known as “chained methods.” A statement with chained methods has this general form:
 * result = method1().method2().method3();
 * In theory, any number of methods can be chained in this fashion, although typically you won’t
 * see more than three. Here’s how to decipher these "handy Java shortcuts" when you encounter
 * them:
 * 1. Determine what the leftmost method call will return (let’s call it x).
 * 2. Use x as the object invoking the second (from the left) method. If there are only two
 * chained methods, the result of the second method call is the expression’s result.
 * 3. If there is a third method, the result of the second method call is used to invoke the
 * third method, whose result is the expression’s result–for example,
 * */

public class ChainMethod {
    public static void main(String[] args) {
        String x = "abc";
        String y = x.concat("def").toUpperCase().replace('C', 'x'); //chained methods
        System.out.println(x);
        System.out.println("y = " + y);
    }
    //Let’s look at what happened. The literal def was concatenated to abc, creating a temporary,
    //intermediate String (soon to be lost), with the value abcdef. The toUpperCase() method was
    //called on this String, which created a new (soon to be lost) temporary String with the value
    //ABCDEF. The replace() method was then called on this second String object, which created a
    //final String with the value ABxDEF and referred y to it
}
