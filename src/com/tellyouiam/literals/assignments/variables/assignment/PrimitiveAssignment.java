package com.tellyouiam.literals.assignments.variables.assignment;
/**
 * The most important point to remember is that a LITERAL INTEGER (such as 7) is always implicitly an int.
 * */
public class PrimitiveAssignment {
    public static void main(String[] args) {


        int x = 7;     //literal assignment
        int y = x + 2;  //assignment with an expression (including a literal)

        int z = x * y; //assignment with an expression (Ok because x and y implicitly is int type)

        //No big deal if you’re assigning a
        //value to an int or a long variable, but what if you’re assigning to a byte variable? After all,
        //a bytesized holder can’t hold as many bits as an int-sized holder. Here’s where it gets weird. The following is legal:

        byte b = 27;

        //Preceding code is identical to:

        byte B = (byte) 27;

        //Because the compiler automatically narrows the literal value to a byte.
        // In other words, the compiler puts in the cast

        /**
         * We know that a literal integer is always an int, but more importantly, the result of an expression
         * involving anything int-sized or SMALLER is always an int. In other words, add two bytes together and
         * you’ll get an int—even if those two bytes are tiny. Multiply an int and a short and you’ll get an int.
         * Divide a short by a byte and you’ll get…an int. Okay, now we’re at the weird part. Check this out:
         * */
        //Byte is smaller-sized compare to int
        byte m = 3;
        byte n = 8;
        byte o = (byte) (m + n);

        //Long is bigger-sized compare to int
        long aa = 1;
        long bb = 2;
        long cc = aa + bb;
    }
}
