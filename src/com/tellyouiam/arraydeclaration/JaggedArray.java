package com.tellyouiam.arraydeclaration;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[5][];
        jaggedArray[0] = new int[]{1, 2, 3}; // 3 item array
        jaggedArray[1] = new int[10]; // 10 item array
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
