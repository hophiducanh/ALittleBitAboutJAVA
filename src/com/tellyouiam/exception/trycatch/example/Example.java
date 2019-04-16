package com.tellyouiam.exception.trycatch.example;

public class Example {
    public static void main(String[] args) {
        //This code fall into UncheckedException, the compiler don't recognize and check whether Exception has occur

        //        int[] num = {1, 2, 3, 4};
        //        System.out.println(num[5]);

        //Nhưng nếu trình biên dịch không làm gì cả thì chúng ta cũng đừng đứng khoanh tay nhé.
        // Để chắc chắn ứng dụng của chúng ta “khỏe mạnh”, bạn nên lường trước các tình huống có khả năng xảy ra Exception
        // và bao các đoạn code “có khả năng gây bệnh” vào khối try catch.

        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[5]);
            //Chạy thử đọc lỗi rồi lấy lỗi đó bỏ vào catch nhé.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("can't find num[5] element in this array");
        }
    }
}
