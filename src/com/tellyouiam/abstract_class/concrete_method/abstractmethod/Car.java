package com.tellyouiam.abstract_class.concrete_method.abstractmethod;

abstract class Car {
    //Abstract method phải đi cùng void method.

    void startEngine () {
    }

    abstract void goForward();

    abstract void reverse();

    void stop() {

    };

    abstract void turn(int a);

}
