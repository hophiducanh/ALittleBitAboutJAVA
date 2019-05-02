package com.tellyouiam.operator.equalityoperator.equalmethod;
/***/
public class Budgie {
    public static void main(String[] args) {
        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";

        System.out.println(b1.equals(b2)); //false ((notice that the Budgie class did NOT override Object.equals())
       //Look at equal.hashcode.method
        System.out.println(b1.equals(b3)); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
    }
}
