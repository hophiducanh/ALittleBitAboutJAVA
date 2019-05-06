package com.tellyouiam.exception.exceptionpropagation;

import java.io.IOException;

/**
 * Unlike Unchecked Exceptions, the propagation of exception does not happen in case of Checked Exception
 * and its mandatory to use throw keyword here. Only unchecked exceptions are propagated.
 * Checked exceptions throw compilation error.
 *
 * In example below, If we omit the throws keyword from the m() and n() functions,
 * the compiler will generate compile time error. Because unlike in the case of unchecked exceptions,
 * the checked exceptions cannot propagate without using throws keyword.
 * */

public class CheckedExceptionPropagation {
    // exception propagated to n()
    void m() throws IOException
    {
        // checked exception occurred
        throw new IOException("device error");
    }

    // exception propagated to p()
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try {

            // exception handled
            n();
        }
        catch (Exception e) {
            System.out.println("exception handled");

            //We discussed that a call stack builds upward with the most recently called method at the top. You will
            //notice that the printStackTrace() method prints the most recently entered method first and continues
            //down, printing the name of each method as it works its way down the call stack (this is called “unwinding
            //the stack”) from the top

            e.printStackTrace();

            //  Output:
            //  at com.tellyouiam.exception.exceptionpropagation.CheckedExceptionPropagation.m(CheckedExceptionPropagation.java:20)
            //	at com.tellyouiam.exception.exceptionpropagation.CheckedExceptionPropagation.n(CheckedExceptionPropagation.java:26)
            //	at com.tellyouiam.exception.exceptionpropagation.CheckedExceptionPropagation.p(CheckedExceptionPropagation.java:33)
            //	at com.tellyouiam.exception.exceptionpropagation.CheckedExceptionPropagation.main(CheckedExceptionPropagation.java:44)
        }
    }

    public static void main(String args[])
    {
        CheckedExceptionPropagation obj = new CheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}
