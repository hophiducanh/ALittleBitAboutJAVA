package com.tellyouiam.exception.trycatch.example;

public class HowTryCatchWorkExample {
    public static void main(String[] args) {

        /**
         *  Không phải lúc nào các câu lệnh bên trong khối try cũng gây ra Exception. Nếu câu lệnh trong khối
         *  try không gây ra exception thì catch sẽ không được thực thi.
         * */

        //Try là nơi để bao lấy đoạn code có khả năng gây ra exception
        //Try is a place to cover code that is likely to cause an exception
        try {
            System.out.println("Problem of division");

            int result = 10 / 2;
            System.out.println("Ten divided by Two equal: " + result);

            int result1 = 10 / 1;
            System.out.println("Ten divided by One equal: " + result1);

            //As soon as system detected where exception has occur, these lines will not execute anymore and replaced
            // by block of code in catch
            //Ngay khi hệ thống phát hiện có Exception trong khối try xảy ra, thì các dòng code bên dưới của khối try
            //đó sẽ không được thực thi nữa mà nhường chỗ cho các khối lệnh trong catch thực thi kế tiếp

            int result2 = 10 / 0;
            //Dòng này sẽ không được in ra.
            System.out.println("Ten divided by Zero equal: " + result2);

        } catch (ArithmeticException e) {
            System.out.println("Can't execute this division");
        }
    }
}
