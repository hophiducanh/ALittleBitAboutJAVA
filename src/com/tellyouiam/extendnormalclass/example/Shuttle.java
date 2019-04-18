package com.tellyouiam.extendnormalclass.example;

public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go();
    }

    private void go() {
        blastOff();
        //new Rocket().blastOff(); compiler error cause by private access modifier of blassOff method in Rocket class
    }

    private void blastOff() {
        System.out.println("sh-bang");
    }
}
