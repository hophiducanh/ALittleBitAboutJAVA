package com.tellyouiam.polymorphism;

/**
 * The doShapes() method knows only that the objects are a type of
 * GameShape since that’s how the parameter is declared. And using a reference variable declared as type
 * GameShape—regardless of whether the variable is a method parameter, local variable, or instance
 * variable—means that only the methods of GameShape can be invoked on it. The methods you can call on a
 * reference are totally dependent on the declared type of the variable, no matter what the actual object is,
 * that the reference is referring to. That means you can’t use a GameShape variable to call, say, the
 * getAdjacent() method even if the object passed in is of type TilePiece
 * */


//Ở đây chúng ta đa hình vì muốn các subclass có thể phương thức trong superclass mà không phải khai báo lại.
public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece playerPiece = new PlayerPiece();
        TilePiece tilePiece = new TilePiece();

        //Polymorphism here. We don't care actual object passed to doShape method is (PlayerPiece and TilePiece).
        //What we really are about is which reference object is (GameShape: superclass of PlayerPiece, TilePiece )

        doShape(playerPiece); //Displaying Shape (belong to GameShape Class)
        doShape(tilePiece);  //Displaying Shape

    }

    private static void doShape(GameShape shape) {
        shape.displayShape();

    }
}
