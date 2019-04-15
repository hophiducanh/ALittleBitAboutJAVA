package com.tellyouiam.stringinjava;

public class StringBufferReplace {
    public static void main(String[] args) {
        StringBuffer str3 = new StringBuffer("Hello World! Hello Yellow Code Books");
        str3.replace(0, 5, "Hi");
        //replace method force you to specify begin and end index to replace
        System.out.println(str3); // Kết quả in ra là "Hi World! Hello Yellow Code Books!"
    }
}
