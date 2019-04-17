package com.tellyouiam.string.finalstring;

public class Test {
    public static void main(String[] args) {
        //String class là final class, một class được đánh dấu là final thì không thể thừa kế (inherit), extend
        String lalala = "Tiger";//Vì là final class nên gán lại không thay đổi giá trị thực sự mà
        //chính là tạo ra một biến mới -> ảnh hưởng đến hiệu năng, nền dùng String Builder, String Buffer
        lalala = "haha";
        System.out.println(lalala.concat("Stupid"));

        final String subname = "Tiger";//Không thể gán lại giá trị
        //subname = "haha";
        System.out.println(subname.concat("Intelligent")); // ----> Thay đổi bản sao.
        //subname = new String("haha");
        System.out.println(subname); //Tiger

        //subname = new String("Monkey");  -----> error: final String can't reassign

    }
}
