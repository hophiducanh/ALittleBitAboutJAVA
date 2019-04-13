package com.tellyouiam.pass_by_reference_and_pass_by_value;

public class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;
    }

    public static void main(String args[]) {
        Operation2 op = new Operation2();

        System.out.println("Trước khi thay đổi: " + op.data);
        op.change(op); // truyền đối tượng
        System.out.println("Sau khi thay đổi: " + op.data);

        //Đây không phải là tham chiếu mà là tham trị, thay đổi được giá trị gốc vì thay đổi giá trị bản sao
        // có tham chiếu đến cũng địa chỉ ô nhớ mà bản gốc tham chiếu đến
    }
    //https://viettuts.vn/java/truyen-gia-tri-va-tham-chieu-pass-value-va-pass-reference-trong-java
}
