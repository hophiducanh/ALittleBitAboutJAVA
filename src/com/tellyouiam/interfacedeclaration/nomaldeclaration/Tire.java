package com.tellyouiam.interfacedeclaration.nomaldeclaration;

public class Tire implements Bounceable {

    @Override
    public void bounce() {
        //BAR value can't bre reassign
        System.out.println(BAR);
    }

    @Override
    public void setBounceFactor() {

    }

    public static void main(String[] args) {
        System.out.println(BAR);
    }
}
