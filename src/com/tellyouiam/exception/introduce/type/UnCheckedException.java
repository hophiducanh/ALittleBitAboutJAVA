package com.tellyouiam.exception.introduce.type;

public class UnCheckedException {

    //Exception này khá nguy hiểm và xảy ra khi ứng dụng đang thực thi nên được gọi là RUNTIME EXCEPTION

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        //Mảng không có phần tử thứ 5

        //System.out.println(num[5]);
    }
}
