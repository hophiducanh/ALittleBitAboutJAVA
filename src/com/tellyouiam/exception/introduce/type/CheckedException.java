package com.tellyouiam.exception.introduce.type;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Checked exceptions have Exception in their hierarchy but not RuntimeException. They
 * must be handled or declared. They can be thrown by the programmer or by the JVM.
 * Common runtime exceptions include the following:
 *
 * FileNotFoundException: Thrown programmatically when code tries to reference a file
 * that does not exist
 *
 * IOException: Thrown programmatically when there’s a problem reading or writing a file
 *
 * For the OCA exam, you only need to know that these are checked exceptions. Also keep
 * in mind that FileNotFoundException is a subclass of IOException, although the exam will
 * remind you of that fact if it comes up. You’ll see these two exceptions in more detail on the
 * OCP exam.
 * */

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
