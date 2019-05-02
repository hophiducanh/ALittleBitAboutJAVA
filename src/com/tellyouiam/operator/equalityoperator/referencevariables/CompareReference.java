package com.tellyouiam.operator.equalityoperator.referencevariables;

import javax.swing.*;
/**
 * Because == operator is looking at bit pattern, so for reference variables, this
 * means that if the bits in both reference variables are identical, then both refer to the same object
 * */
public class CompareReference {
    public static void main(String[] args) {
        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;
        System.out.println("Is reference a == b " + (a == b)); //false
        System.out.println("Is reference a == c " + (a == c)); //true

        //This code creates three reference variables. The first two, a and b, are separate JButton objects that
        //happen to have the same label. The third reference variable, c, is initialized to refer to the same object
        //that a refers to. When this program runs, the following output is produced:
        //Is reference a == b false
        //Is reference a == c true

        /**
         * This shows us that a and c reference the same instance of a JButton. The == operator will not test
         * whether two objects are “meaningfully equivalent,” a concept we’ll cover in much more detail in Chapter
         * 6, when we look at the equals() method (as opposed to the equals operator we’re looking at here).
         * */

    }
}
