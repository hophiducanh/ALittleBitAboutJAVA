package com.tellyouiam.exception.introduce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    //need throws FileNotFoundException
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/etc");

        // Dòng code phía dưới sẽ gây ra CheckedException tức là Exception không vượt qua được cửa ải của Complier.
        // Tức là bạn sẽ nhận được các thông báo lỗi từ trình biên dịch khi mà nó phát hiện ra rằng bạn đang code
        // các dòng code nào đó mà có khả năng xảy ra Exception. Và do bởi trình biên dịch đã xuất sắc phát hiện
        // Exception cho bạn rồi nên mới có cái tên là Checked, tức là “đã kiểm duyệt”.
        // ví dụ như gõ nhầm System.out thành SSSystem.out vậy đó. Dòng dưới bị lỗi nếu không ném ra
        // FileNotFoundException

        //FileReader fr = new FileReader(file);
    }
}
