package com.tellyouiam.arraydeclaration.twodimensionalarray;

import java.util.Arrays;

public class Constructing {
    public static void main(String[] args) {
        int[][] myArray = new int[3][];
        myArray[0] = new int[2]; //first element of myArray is an int array of two int elements
        myArray[0][0] = 6;
        myArray[1] = new int[3]; //second element of myArray is an int array of three int elements
        myArray[1][0] = 9;
        System.out.println(Arrays.deepToString(myArray));
    }
}
