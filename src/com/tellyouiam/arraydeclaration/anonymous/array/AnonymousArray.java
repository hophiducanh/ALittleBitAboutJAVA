package com.tellyouiam.arraydeclaration.anonymous.array;

/**
 *An array in Java without any name is anonymous array. It is an array just for creating and using instantly.
 *
 * We can create an array without name, such type of nameless arrays are called anonymous array.
 * The main purpose of anonymous array is just for instant use (just for one time usage) .
 * Anonymous array is passed as an argument of method
 * */

public class AnonymousArray {
    public static void main(String[] args) {
        //anonymous array
        sum(new int[]{1, 2, 3});
    }
    public static void sum(int[] a) {
        int total = 0;

        //using for-each loop
        for(int i : a)
            total = total + 1;
        System.out.println("The sum is:" + total);
    }
}
