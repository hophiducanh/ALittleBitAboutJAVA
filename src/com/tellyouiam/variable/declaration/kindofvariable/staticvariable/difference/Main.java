package com.tellyouiam.variable.declaration.kindofvariable.staticvariable.difference;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setBarcode(123456);
        Product prod2 = new Product();
        prod2.setBarcode(987654);

        //So với trong difference instance varivale thì kết quả ở đây khác hẳn.
        System.out.println(prod1.getBarcode()); //987654
        System.out.println(prod2.getBarcode()); //987654
    }
}
