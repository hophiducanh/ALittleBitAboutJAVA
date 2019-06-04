package com.tellyouiam.polymorphism.example;

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

        // We don't care actual object passed to doShape method is (PlayerPiece and TilePiece).
        //What we really are about is which reference object is (GameShape: superclass of PlayerPiece, TilePiece )

        doShape(playerPiece); //Displaying Shape (belong to GameShape Class)
        doShape(tilePiece);  //Displaying Shape

        //Chúng ta chỉ có một đối tượng nhưng lại có tới 4 Reference Type khác nhau. Vậy biến tham chiếu nào có thể
        //gọi phương thức displayShape() ?

        /**
         * Polymorphism is the ability of an object to take on many forms.
         * The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
         *
         * Any Java object that can pass more than one IS-A test is considered to be polymorphic.
         * In Java, all Java objects are polymorphic since any object will paassss the IS-A test for their own type and for the class Object.
         * */
        //Polymorphism here. Đa hình có sẵn trong java vì Cl nào cũng là IS-A của Object class
        PlayerPiece player = new PlayerPiece();
        Object o = new PlayerPiece();
        GameShape shape = new PlayerPiece();
        Animatable mover = new PlayerPiece();


        player.displayShape(); //Displaying Shape (Trường hợp này trong PlayerPiece không override lại phương thức
        // của GameShape, còn nếu override lại thì sẽ gọi version displayShape() của PlayerPiece)
        shape.displayShape(); //Gọi ra reference type
        mover.animate();



        /**
         * Remember that method invocations allowed by the compiler are based solely on the declared type of
         * the reference, regardless of the object type (OCA) - Cái này quyết định bởi complier, tức là phương thức
         * print() được gọi chỉ phương thức của superbclass, chứ không phải của Subclass. Điều này được xác định rõ
         * ràng ngay tại compiler time chú không cần tại runtime.
         * Ex:  PlayerPiece player = new PlayerPiece(); thì phương thức compiler cho phép reference variable player
         * được gọi chỉ là phương thức của PlayerPiece.
         * Animatable mover = new PlayerPiece(); mặc dù PlayerPiece implements Animatable nhưng compiler chỉ cho phép
         * gọi phương thức của Animatable (Reference Type) nên không thể gọi phương thức displayShape();
         * */

        /**
         * We’ve left out one big part of all this, which is that even though the compiler only knows about the
         * declared reference type, the Java Virtual Machine (JVM) at runtime knows what the object really is. And
         * that means that even if the PlayerPiece object’s displayShape() method is called using a GameShape
         * reference variable, if the PlayerPiece overrides the displayShape() method, the JVM will invoke the
         * PlayerPiece version! The JVM looks at the real object at the other end of the reference, “sees” that it
         * has overridden the method of the declared reference variable type, and invokes the method of the object’s
         * actual class. (OCA)
         * */

        /**
         * Polymorphic method invocations apply only to instance methods. You can always refer to an object with a more general
         * reference variable type (a superclass or interface), but at runtime, the ONLY things that are dynamically selected based on the
         * actual object (rather than the reference type) are instance methods. Not static methods. Not variables. Only overridden
         * instance methods are dynamically invoked based on the real object’s type.
         * */
    }

    private static void doShape(GameShape shape) {
        shape.displayShape();
    }
}
