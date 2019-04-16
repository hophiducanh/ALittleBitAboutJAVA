package com.tellyouiam.exception.introduce.practice;

public class Practice3 {
    public static void main(String[] args) throws NullPointerException {
        //Chạy thử báo lỗi NullPointerException, thêm throws NullPointerException rồi check type exception nhé
        // ----> RunTimeException
        String s = null;
        System.out.println(s.length());
    }
}
