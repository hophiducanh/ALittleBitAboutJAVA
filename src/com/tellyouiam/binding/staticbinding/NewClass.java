package com.tellyouiam.binding.staticbinding;

/**
 * Static Binding: The binding which can be resolved at compile time by compiler is known as static or early binding.
 * Binding of all the static, private and final methods is done at compile-time
 * */

public class NewClass {

    static class SuperClass {
        // Static method in base class which will be hidden in subclass
        static void print() {
            System.out.println("Print in SuperClass");
        }
    }

    public static class SubClass extends SuperClass {
        // This method hides display() in Base
        static void print() {
            System.out.println("Print in SubClass");
        }
    }


    public static void main(String[] args) {
        SuperClass a = new SuperClass(); //(1)
        SuperClass b = new SubClass(); //(2)

        a.print(); //Print in SuperClass (3)
        b.print(); //Print in SuperClass (4)

        //Tại sao kết quả in ra như thế thì có thể giải thích như sau:
        //Đầu tiên tại do phương thức trong SuperClass là static (static void print) nên Complier biết ngay rằng
        //phương thức đó không thể bị overriden (biết tại thời điểm compile time ) nên chúng ta dẫn đến kêt quả ở trên

        //Tại (1) và (3) không có gì phải bàn cãi vì kết quả đó là ngẫu nhiên
        //Nhưng tại (2) và (4) thì tại sao lại in ra method của SuperClass ?

        /**
         * Remember that method invocations allowed by the compiler are based solely on the declared type of
         * the reference, regardless of the object type (OCA) - Cái này quyết định bởi complier, tức là phương thức
         * print() được gọi chỉ phương thức của superbclass, chứ không phải của Subclass. Điều này được xác định rõ
         * ràng ngay tại compiler time chú không cần tại runtime.
         * Ex: Subclass c = new SubClass(); thì phương thức compiler cho phép reference variable c được gọi chỉ là phương
         * thức của Subclass
         * */

        //
    }
}
