package com.tellyouiam.loops;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++) {
            System.out.println("Inside loop");
            if(i > 5)
                continue; //non-labeled statement
            //continue không tiếp tục thực thi câu lệnh follow up
            System.out.println(i);
        }
    }
}
