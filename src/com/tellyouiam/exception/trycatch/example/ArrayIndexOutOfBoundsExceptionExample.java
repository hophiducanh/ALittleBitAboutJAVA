package com.tellyouiam.exception.trycatch.example;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] randomIntNumbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randomIntNumbers[i] = rand.nextInt(100);
        }
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Which index of these elements that you want to print? ");
            int index = input.nextInt();
            System.out.println("OK, the element has index " + index + " has value " + randomIntNumbers[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an index number between 0 and 9");
        }
    }
}
