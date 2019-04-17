package com.tellyouiam.finalkeyword.blankfinal.multiconstructor;


public class Test {
    final public int i;

    //Không được gọi
    private Test(short val1) {
        this.i = val1;
    }

    private Test(int val) {
        this.i = val;
    }

    private Test() {
        //This keyword
        //This(10) dùng để gọi constructor ngay trước nó
        this(10);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.i);

        Test t2 = new Test();
        System.out.println(t2.i);
    }

}
