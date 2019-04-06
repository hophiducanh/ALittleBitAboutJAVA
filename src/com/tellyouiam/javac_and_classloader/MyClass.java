package com.tellyouiam.javac_and_classloader;

//Overloaded main() function java.
public class MyClass {
    public static void main(String[] args) {
        System.out.println("main(String[] args)");
        main("a");

        //https://aptech.vn/kien-thuc-tin-hoc/tim-hieu-ve-java-class-loader.html
        java.lang.Class classObj = MyClass.class;

        classObj.getClassLoader();

        System.out.println(classObj);
        //class loader
        //https://www.javatpoint.com/java-class-getclassloader-method
        System.out.println(classObj.getClassLoader());
    }

    public static void main(String arg1) {
        System.out.println("main(String arg1)");
        MyClass.main("b", "c");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main(String arg1, String arg2)");
    }
}
