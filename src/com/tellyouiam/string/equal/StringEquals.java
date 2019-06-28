package com.tellyouiam.string.equal;

/**
 *Reference:
 * https://javapapers.com/core-java/string-equals-java-puzzle/
 * http://etutorials.org/Programming/Java+performance+tuning/Chapter+5.+Strings/5.2+Compile-Time+Versus+Runtime+Resolution+of+Strings/
 * */
public class StringEquals {
    public static void main(String[] args) {
        jack();
        jill();
        String a1 = new String("a");
        String a2 = new String("a");
        System.out.println("a1 compare s2 " + a1.equals(a2));
    }

    public static void jack() {
        String s1 = "hill5";
        String s2 = "hill" + "5";
        System.out.println(s1==s2); //true
        //True because at compile time String s2 fully resolved -> "hill5" -> String Pool -> s1 and s2 are point
        // to "hill5" -> true
    }

    public static void jill() {
        String s1 = "hill5";
        String s2 = "hill" + s1.length(); //false
        System.out.println(s1==s2);
        //can't resolve at compile time. We need StringBuffer or StringBuilder as temporary tools to resolve like
        // String s2 = (new String Builder()).append("hill").append("5").toString();
    }
}
