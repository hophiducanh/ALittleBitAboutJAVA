package com.tellyouiam.exception.trycatch.example;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Integer intNumber = null;

            System.out.println("Let's enter a integer number ");
            String strNumber = input.nextLine();
            intNumber = new Integer(strNumber);

            System.out.println("Convert to hexa " + Integer.toHexString(intNumber));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a integer number");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
