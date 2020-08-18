package com.tellyouiam.exception.exceptionpropagation.declaration;
/**
 * Another name: Ducking exception or passing the buck. (OCA)
 *
 * So what happens to a ducked exception? Before we discuss that, we need to briefly review the concept
 * of the call stack. Most languages have the concept of a method stack or a call stack. Simply put, the call
 * stack is the chain of methods that your program executes to get to the current method. If your program
 * starts in method main() and main() calls method a(), which calls method b(), which in turn calls
 * method c(), the call stack consists of the following:
 *  c
 *  b
 *  a
 *  main()
 * */

/**
 *
 * Exception propagation : An exception is first thrown from the top of the stack and if it is not caught,
 * it drops down the call stack to the previous method.
 * After a method throws an exception, the runtime system attempts to find something to handle it.
 * The set of possible “somethings” to handle the exception is the ordered list of methods that
 * had been called to get to the method where the error occurred.
 * The list of methods is known as the call stack and the method of searching is Exception Propagation
 * when an exception happens, Propagation is a process in which the exception
 * is being dropped from to the top to the bottom of the stack. If not caught once,
 * the exception again drops down to the previous method and so on until it gets caught or until it reach the very bottom of the call stack.
 * This is called exception propagation and this happens in case of Unchecked Exceptions.
 * Reference: https://www.geeksforgeeks.org/exception-propagation-java/
 * */
public class UncheckedExceptionPropagation {
    void m() {
        int data = 50 / 0; // unchecked exception occurred (Lưu ý rằng exception propagation chỉ áp dụng được cho unchecked exception)
        // exception propagated to n()
    }

    void n() {
        m();
        // exception propagated to p()
    }

    void p() {
        try {
            n(); // exception handled
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.p();
        System.out.println("Normal flow...");
    }
}
