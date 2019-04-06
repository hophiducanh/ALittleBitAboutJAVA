package com.tellyouiam.javac_and_classloader;

public class ClassgetClassLoaderExample {
    public static void main(String[] args) {
        try {
            Class clsobj = Class.forName("Class.ClassgetClassLoaderExample");
            //document in MyClass
            ClassLoader ClsLoader = clsobj.getClassLoader();

            if (ClsLoader == null) {
                System.out.println("System class was used.");
            } else {
                // returns the class loader
                Class loaderCls = ClsLoader.getClass();

                System.out.println("Associated with ClassLoader = " + loaderCls.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString()); //coverting exception object to string and printing it
        }
    }
}
