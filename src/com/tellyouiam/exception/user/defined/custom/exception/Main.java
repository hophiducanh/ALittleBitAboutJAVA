package com.tellyouiam.exception.user.defined.custom.exception;
/**
 * Java provides us facility to create our own exceptions which are basically derived classes of Exception.
 * For example MyException in below code extends the Exception class.
 * We pass the string to the constructor of the super class- Exception which is obtained using “getMessage()” function on the object created.
 *
 * Reference: https://www.geeksforgeeks.org/g-fact-32-user-defined-custom-exception-in-java/
 * */
public class Main {
    public static void main(String[] args) {
        try
        {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage()); //GeeksGeeks
        }
    }
}
