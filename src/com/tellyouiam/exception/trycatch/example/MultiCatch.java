package com.tellyouiam.exception.trycatch.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream;
            outputStream = new FileOutputStream("/home/logbasex/db.json");
            outputStream.write(65);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //Do FileNotFoundException là subclass của IOException nên chỉ cần khai báo IOException là đủ.
            //Lấy ví dụ minh hoa thôi =)) . Có thể catch multi exception in one CATCH clause
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
