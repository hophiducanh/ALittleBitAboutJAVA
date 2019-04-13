package com.tellyouiam.string.final_string;

public class Test {
    //String class là final class, một class được đánh dấu là final thì không thể thừa kế (inherit), extend
    String lalala = "Tiger";//Vì là final class nên gán lại không thay đổi giá trị thực sự mà
    //chính là tạo ra một biến mới -> ảnh hưởng đến hiệu năng, nền dùng String Builder, String Buffer

    final String subname = "Tiger";//Không thể gán lại giá trị

}
