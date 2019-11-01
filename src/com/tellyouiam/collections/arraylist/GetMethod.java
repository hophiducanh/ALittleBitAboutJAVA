package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetMethod {
    public static void main(String[] args) {
        List<Integer> list = Collections.singletonList(5);
        //list.add(5); //unsupported operation: immutable

        List<Integer> l1 = Arrays.asList(1,2);
        //l1.add(3); //unsupported operation (Fix size).
        System.out.println(l1.get(0));

        List<Integer> l2 = new ArrayList<>();

        Object[] a = {};
        //System.out.println(Arrays.toString(a));

        //https://www.programcreek.com/2014/05/top-10-mistakes-java-developers-make/
        //https://stackoverflow.com/questions/26027396/arrays-aslist-vs-collections-singletonlist?noredirect=1&lq=1
    }
}
