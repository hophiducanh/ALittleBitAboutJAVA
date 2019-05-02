package com.tellyouiam.literals.assignments.variables.assignment;

/**
 * Casts can be implicit or explicit. An implicit cast means you don’t have to write code for the cast; the
 * conversion happens automatically. Typically, an implicit cast happens when you’re doing a widening
 * conversion—in other words, putting a smaller thing (say, a byte) into a bigger container (such as an int).
 * Remember those “possible loss of precision” compiler errors we saw in the assignments section?
 * Those happened when we tried to put a larger thing (say, a long) into a smaller container (such as a
 * short). The large-value-into-small-container conversion is referred to as narrowing and requires an
 * explicit cast, where you tell the compiler that you’re aware of the danger and accept full responsibility.
 * */

public class PrimitiveCasting {
    public static void main(String[] args) {

        //implicit cast
        int a = 100;
        long b = a; //Implicit cast, an int value  always fits in a long

        //explicit cast
        float a1 = 100.001f;
        //int b1 = a1; //Nếu không dùng explicit cast thì compiler sẽ ném ra lỗi "possible lost of precision"
        int b1 = (int) a1; //explicit cast, the int might lost some of float's info (Also lost of precision but
        //you're aware of the danger and accept full responsibility)
    }
}
