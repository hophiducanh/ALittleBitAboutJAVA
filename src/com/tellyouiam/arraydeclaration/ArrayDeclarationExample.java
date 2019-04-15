package com.tellyouiam.arraydeclaration;

/**
 *  Arrays can hold either primitives or object references, but an array itself
 * will always be an object on the heap, even if the array is declared to hold primitive elements. In other
 * words, there is no such thing as a primitive array, but you can make an array of primitives
* */
public class ArrayDeclarationExample {
    //Arrays are declared by stating the type of elements the array will hold (an object or primitive),
    //followed by square bracket to either of the identifier

    //Square bracket before name (recommend)
    int[] key;

    //Square bracket after name (legal but less readable)
    int key1 [];

    //The first example is a three-dimensional array (an array of arrays of arrays)
    String[][][] occupantName;

    //Two dimensional array (Khai báo vẫn hợp lệ với complier, NÓ HỢP LỆ KHÔNG CÓ NGHĨA LÀ NÓ "ĐÚNG")
    String[] managerName [];



    public static void main(String[] args) {
        double[] a [] = {
                {99.0, 85.0, 98.0, 0.0},
                {98.0, 57.0, 79.0, 0.0},
                {92.0, 77.0, 74.0, 0.0},
                {94.0, 62.0, 81.0, 0.0},
                {99.0, 94.0, 92.0, 0.0},
                {80.0, 76.5, 67.0, 0.0},
                {76.0, 58.5, 90.5, 0.0},
                {92.0, 66.0, 91.0, 0.0},
                {97.0, 70.5, 66.5, 0.0},
                {89.0, 89.5, 81.0, 0.0},
                {0.0, 0.0, 0.0, 0.0}
        };

        for (double[] doubles : a) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
