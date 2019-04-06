package com.tellyouiam.strictfp_keyword;

public class Test {
    //https://vi.wikipedia.org/wiki/S%E1%BB%91_th%E1%BB%B1c_d%E1%BA%A5u_ph%E1%BA%A9y_%C4%91%E1%BB%99ng
    //Dấu phẩy động tuân theo chuẩn IEEE 754 (độ chính xác 23 bit, 8 bit mũ) lưu trữ với độ dài 32 bit.
    private strictfp double sum() {
        //10e+10 in short of 10*10^10
        //6e+08 in short of 6*10^08
        double num1 = 10e+10;
        double num2 = 6e+08;
        return (num1 + num2);
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum());
    }
}
