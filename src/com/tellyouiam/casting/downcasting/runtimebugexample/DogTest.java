package com.tellyouiam.casting.downcasting.runtimebugexample;

public class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //instanceof kiểm tra kiểu tại Runtime, vì tại Runtime actual object là Object type - Animal, Animal (not a type
        // of Dog) nên: if (animal instanceof Dog) return false
        if (animal instanceof Dog) {//false
            //Nếu không có câu lệnh if này thì câu lệnh dưới sẽ ném ra ClassCastException vì không thể cast
            //subclass object to superclass (chỉ đối với )
            Dog d = (Dog) animal;
        }
    }
}
