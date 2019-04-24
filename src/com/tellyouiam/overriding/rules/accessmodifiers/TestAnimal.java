package com.tellyouiam.overriding.rules.accessmodifiers;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat(); //2 phương thức eat này tại compile time chỉ có thể gọi của reference type (Animal). Nhưng tại runtime
        // b lại gọi eat() method của Horse, người ta gọi đó là đa hình tại run time.
        b.eat();
    }
}
