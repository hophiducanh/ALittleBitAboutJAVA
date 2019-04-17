package com.tellyouiam.variable.declaration.kindofvariable.instancevariable.difference;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.barcode = 123456;

        Product prod2 = new Product();
        prod2.barcode = 987654;

        System.out.println(prod1.barcode); //123456
        System.out.println(prod2.barcode); //987654
    }

}
