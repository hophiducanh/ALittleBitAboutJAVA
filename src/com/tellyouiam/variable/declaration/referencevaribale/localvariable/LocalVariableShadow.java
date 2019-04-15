package com.tellyouiam.variable.declaration.referencevaribale.localvariable;

/**
 * It is possible to declare a local variable with the same name as an instance variable. It’s known as
 * SHADOWING, as the following code demonstrates:
* */
public class LocalVariableShadow {

    //Declare an instance variable named count
    private int count = 9;

    public void logIn() {
        //Declare a local variable named count
        int count = 10;
        System.out.println("local variable count is " + count);
    }
    public void count() {
        System.out.println("instance variable count is " + count);
    }

    public static void main(String[] args) {
        new LocalVariableShadow().logIn(); //10
        new LocalVariableShadow().count(); //9
    }
    //Đây là trường hợp local variable và instance variable cùng tên với nhau, xử lí hoàn toàn bình thường, nhưng với
    //trường hợp local variable, instance variable và parameter method thì sao? Cùng đón xem với this keyword nhé.
}
