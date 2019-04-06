package com.tellyouiam.serializable.demo;

import java.io.*;

public class WriteObjectDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/customer.dat")));
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("kai");
        customer.setAddress("ha noi");

        System.out.println("Customer before serialization:");
        System.out.println(customer);
        oos.writeObject(customer);
        oos.close();
    }
}
