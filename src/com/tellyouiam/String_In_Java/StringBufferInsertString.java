package com.tellyouiam.String_In_Java;

public class StringBufferInsertString {
    public static void main(String[] args) {
        StringBuffer str2 = new StringBuffer("Hello World!");
        str2.append(" Hello Yellow Code Books!");
        str2.insert(5, " Java");//Insert begin at fifth character (số thứ tự ordinal number)

        System.out.println(str2); // Kết quả in ra là "Hello Java World! Hello Yellow Code Books!"

    }
}
