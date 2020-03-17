package com.tellyouiam.file.io.practice.readwriteobject;

import java.io.*;

public class WriteObjectToFile {

    private static final String PATH = "./src/com/tellyouiam/file/io/practice/readwriteobject/test.txt";

    public static void main(String[] args) {

        Person person1 = new Person("HoAnh", 20, "Male");
        Person person2 = new Person("Logbasex", 25, "Female");

        try {
            FileOutputStream fos = new FileOutputStream(new File(PATH));

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
            fos.close();

            FileInputStream fi = new FileInputStream(new File(PATH));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
