package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertPrimitiveArrayToArrayList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];

        /*
         List<String> ls = new ArrayList<String>(arr);
         Not work because Arrays.asList() will return an ArrayList which is a private static class inside Arrays, it is not the java.util.ArrayList class.
         The java.util.Arrays.ArrayList class has set(), get(), contains() methods, but does not have any methods for adding elements, so its size is fixed.
         To create a real ArrayList, you should do:
        */
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        // https://stackoverflow.com/questions/2607289/converting-array-to-list-in-java
        // Convert primitive arr to object array (int[] arr >> List<Integer>) step by step:
        // 1. convert primitive type to object type :
        int[] spam = new int[] { 1, 2, 3 };

        List<Integer> ls = Arrays.stream(spam)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> l1 = Arrays.asList(1,2,3);
        System.out.println(Arrays.toString(new List[]{l1}));

        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        System.out.println(Arrays.toString(new List[]{l2}));
        //https://stackoverflow.com/questions/28851652/java-lang-classcastexception-java-util-arraysarraylist-cannot-be-cast-to-java

    }
}
