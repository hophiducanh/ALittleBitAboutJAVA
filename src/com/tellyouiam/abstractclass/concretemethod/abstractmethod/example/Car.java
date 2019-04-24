package com.tellyouiam.abstractclass.concretemethod.abstractmethod.example;

abstract class Car {
    //Abstract method phải đi cùng void method.

    void startEngine () {
    }
    //Abstract method không thể đi cùng final hay private (final ngăn chặn kế thừa, private thì subclass không truy cập được)

    abstract void goForward();

    abstract void reverse();

    void stop() {

    };

    abstract void turn(int a);

}
