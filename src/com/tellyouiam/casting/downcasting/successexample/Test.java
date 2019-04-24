package com.tellyouiam.casting.downcasting.successexample;

public class Test {
    public static void main(String[] args) {
        Animal [] a = { new Animal(), new Dog(), new Animal()};

        for (Animal animal: a) {
            animal.makeNoise();
            //instanceof kiểm tra kiểu tại Runtime, vì tại Runtime actual object
            // là Object type( trường hợp này animal variable có Object type là Dog()) nên if() trả về true.
            if (animal instanceof Dog) {
                // Vì phương thức playDead() chỉ có trong class Dog nên khi dùng instance của Animal để gọi
                // thì compiler say something like: cannot find symbol.
                // Before we try to invoke playDead, we cast the animal variable to type Dog
                //animal.playDead(); Force to casting to follow:

                ((Dog) animal).playDead(); //DOWNCAST

                //Above is th new and improved code block contains a cast, which in this case is sometimes called a downcast,
                //because we’re casting down the inheritance tree to a more specific class
            }
        }
    }
}
