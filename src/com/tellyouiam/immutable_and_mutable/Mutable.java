package com.tellyouiam.immutable_and_mutable;

public class Mutable {
    public static void main(String[] args) {
        //Initialize str1 = "first"
        StringBuffer str1 = new StringBuffer("first");

        //Initialize str2 reference to str1
        StringBuffer str2 = str1;

        //StringBuffer is mutable, hence when you call append method, its value will change on the original memory area
        str1.append("-second");

        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);
        //Ouput: str1: first-second
        //str2: first-second
    }

}
