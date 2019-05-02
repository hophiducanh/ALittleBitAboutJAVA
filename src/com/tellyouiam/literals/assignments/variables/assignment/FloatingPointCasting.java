package com.tellyouiam.literals.assignments.variables.assignment;

/**
 * When you narrow a primitive, Java simply truncates the higher-order bits
 * that won’t fit. In other words, it loses all the bits to the left of the bits you’re narrowing to.
 * Let’s take a look at what happens in the preceding code. There, 128 is the bit pattern 10000000. It
 * takes a full 8 bits to represent 128. But because the literal 128 is an int, we actually get 32 bits, with the
 * 128 living in the rightmost (lower order) 8 bits. So a literal 128 is actually
 * 00000000000000000000000010000000
 * Take our word for it; there are 32 bits there.
 * To narrow the 32 bits representing 128, Java simply lops off the leftmost (higher order) 24 bits. What
 * remains is just the 10000000. But remember that a byte is signed, with the leftmost bit representing the
 * sign (and not part of the value of the variable). So we end up with a negative number (the 1 that used to
 * represent 128 now represents the negative sign bit). Remember, to find out the value of a negative number
 * using 2’s complement notation, you flip all of the bits and then add 1. Flipping the 8 bits gives us
 * 01111111, and adding 1 to that gives us 10000000, or back to 128! And when we apply the sign bit, we
 * end up with –128 (2s'complememt).
 * Reference: https://www.geeksforgeeks.org/1s-2s-complement-binary-number/
 * */

public class FloatingPointCasting {
    public static void main(String[] args) {
        long l = 130L;
        byte b = (byte) l;
        System.out.println("The byte is " + b); //-126. Why?
        //Max value a byte can store is 127, but we don't get runtime error?

        //You must use an explicit cast to assign 128 to a byte, and the assignment leaves you with the value –
        //128. A cast is nothing more than your way of saying to the compiler, “Trust me. I’m a professional. I take
        //full responsibility for anything weird that happens when those top bits are chopped off.”

        byte a = (byte) 128; //-128
        System.out.println("Value of a is: " + a);

        //That brings us to the compound assignment operators. This will compile:
        byte x = 3;
        x += 7; //No problem adds 7 to x (result is 10)

        //And it is equivalent to this:
        byte x1 = 3;
        x1 = (byte) (x1 + 7); //Won't compile without the cast, since b + 7  results in an int

        //The compound assignment operator += lets you add to the value of x, without putting in an explicit cast.
        //In fact, +=, -=, *=, and /= will all put in an implicit cast.
    }
}
