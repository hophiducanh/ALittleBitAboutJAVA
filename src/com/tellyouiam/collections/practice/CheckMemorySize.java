package com.tellyouiam.collections.practice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckMemorySize {
    static long numberOfRecords = 1000;

    public static void main(String[] args) throws IOException {
        testPrimitives(new LinkedList<Integer>());
        testPrimitives(new ArrayList<Integer>());
        testObjects(new LinkedList<User>());
        testObjects(new ArrayList<User>());
    }

    public static void populateListOfPrimitives(List<Integer> list) {
        for (int i = 0; i < numberOfRecords; i++) {
            list.add(i * 10);
        }
    }

    public static void populateListOfObjects(List<User> list) {
        User user = null;
        for (int i = 0; i < numberOfRecords; i++) {
            user = new User();
            user.setName("user_" + i);
            user.setPassword("password_" + i);
            list.add(user);
        }
    }

    public static void testPrimitives(List<Integer> list) throws IOException {
        System.out.println("Primitives " + list.getClass().getSimpleName());
        populateListOfPrimitives(list);
        long size = getBytesFromList(list);
        printInUnits(size);
    }


    public static void testObjects(List<User> list) throws IOException {
        System.out.println("Objects " + list.getClass().getSimpleName());
        populateListOfObjects(list);
        long size = getBytesFromList(list);
        printInUnits(size);
    }

    public static long getBytesFromList(List<?> list) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(list);
        out.close();
        return baos.toByteArray().length;
    }

    public static void printInUnits(long length) {
        System.out.println("list size is :: " + length / 1000000000 + " GB");
        System.out.println("list size is :: " + length / 1000000 + " MB");
        System.out.println("list size is :: " + length / 1000 + " kB");
        System.out.println("list size is :: " + length + " byte");
    }

}

class User implements Serializable {
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
