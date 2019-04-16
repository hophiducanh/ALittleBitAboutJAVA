package com.tellyouiam.serializable.demo;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1;

    private int id;
    private String name;
    //transient: temporary, on OuterClass while, mean won't serialization
    private transient String address;

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
