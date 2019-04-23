package com.tellyouiam.polymorphism;

public class PlayerPiece extends GameShape implements Animatable{
    public void movePiece() {
        System.out.println("moving game piece");
    }

    @Override
    public void animate() {

    }
}
