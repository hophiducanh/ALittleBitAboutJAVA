package com.tellyouiam.abstractclass.concretemethod.abstractmethod;

 abstract class SUV extends Car{
     //một abstract class extends một abstract class không bắt buộc phải override lại,
     //Nhưng một concrete class nào extends abstract class này thì phải implement những abstract method
     //thành concrete method
    void enable4wd() {

    }

    void goForward() {

    }

    void reverse() {

    }

    abstract void goOffRoad();

    //turn() not implemented
}
