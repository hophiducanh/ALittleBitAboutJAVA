package com.tellyouiam.constructor;

public class ConstructorDeclaration {
    //Nhìn qua trông có vẻ constructor giống method nhưng điểm khác biệt chính ở đây
    //là constructor không bao giờ có kiểu trả về. Tuy nhiên constructor vẫn có tất cả
    //các access modifiers bình thường, và cũng có thể nhận vào các arguments (bao gồm cả var-args)
    //Một quy tắc LỚN nữa ở đây là constructor phải có cùng tên với tên CLASS nơi nó được khai báo
    //Constructor cũng không thể đi cùng final, static, abstract


    /**
     * LEGAL constructors
    * */

    ConstructorDeclaration() {}

    //Constructor có thể để private
    private ConstructorDeclaration(Byte b) {}

    ConstructorDeclaration(int x, int... y) {}

    /**
     * ILLEGAL constructors
    * */

    void ConstructorDeclaration() {}  //It's method not a constructor

    //ConstructorDeclaration(short s); //like abstract method

    //static ConstructorDeclaration(float f) {} //can't be static

    //final ConstructorDeclaration(long x) {} //can't be final

    //abstract ConstructorDeclaration(char c) {} //can't be abstract

    //ConstructorDeclaration(int...x, int y) {} //bad var-args syntax
}
