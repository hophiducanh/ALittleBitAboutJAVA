package com.tellyouiam.finalkeyword.declaration;

/**
 * final means that you can't change the object's reference to point to another reference or another object,
 * but you can still mutate its state (using setter methods e.g).
 * Where immutable means that the object's actual value can't be changed,
 * but you can change its reference to another one.
 * <p>
 * Concerning the second part of your question (immutability part),
 * the compiler creates a new String object with the value of "Sam", and points the name reference to it.
 */
public class FinalAndImmutabilityDifference {
    public static void main(String[] args) {
        //Final
        final String surname = "John";
        //name = "Sam" ---> compiler Error


        //Immutable
        String name = "John";
        name = "Sam";
    }
}
