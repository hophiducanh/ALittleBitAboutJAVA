package com.tellyouiam.serializable.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/customer.dat")));
        System.out.println("Customer after deserialization:");
        Customer customer = (Customer) ois.readObject();
        System.out.println(customer);
        ois.close();
    }
}
