package com.tellyouiam.string.equal;

/**
 *Reference:
 * https://javapapers.com/core-java/string-equals-java-puzzle/
 * http://etutorials.org/Programming/Java+performance+tuning/Chapter+5.+Strings/5.2+Compile-Time+Versus+Runtime+Resolution+of+Strings/
 * */
public class StringEquals {
    
    static class SimpleClass {
        private String id;
    
        public SimpleClass(String id) {
            this.id = id;
        }
    }
    
    public static void main(String[] args) {
        //https://www.infoworld.com/article/2073618/java-s-system-identityhashcode.html
        jack();
        jill();
        String a1 = new String("a");
        String a2 = new String("a");
        String a3 = "a";
        String a4 = "a";
        System.out.println("a1 compare s2 " + a1.equals(a2));
        System.out.println(System.identityHashCode(a1));
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(a3));
        System.out.println(System.identityHashCode(a4));
        System.out.println(a3.hashCode()); //String.hashcode();
    
        Object object = null;
        if (System.identityHashCode(object) == 0) {
            System.out.println("hello");
        }
    
        SimpleClass simpleClass = new SimpleClass("Hello");
        SimpleClass simpleClass1 = new SimpleClass("Hello");
        System.out.println(System.identityHashCode(simpleClass));
        System.out.println(simpleClass.hashCode()); //object.hashCode();
        
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
