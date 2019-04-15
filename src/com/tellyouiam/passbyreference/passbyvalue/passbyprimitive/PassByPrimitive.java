package com.tellyouiam.passbyreference.passbyvalue.passbyprimitive;

public class PassByPrimitive {
   private static void modifyPrimitiveTypes(int x, int y) {
       //Dễ dàng thấy biến x chưa, y chưa được dùng vì hàm modifyPrimitiveTypes(x, y) thao tác trên bản sao
       //của x và y.
       x = 11;
       y = 111;
   }

    public static void main(String[] args) {
        int x = 69;
        int y = 96;
        System.out.print("Value of x and y before modification: ");
        System.out.println("x = " + x + ";y =" +y);
        modifyPrimitiveTypes(x, y);
        System.out.print("Value of x and y after modification: ");
        System.out.println("x = " + x + ";y =" +y);
    }
}
// Chúng ta có hai biến, x và y, thuộc kiểu primitive và do đó chúng được lưu trữ bên trong stack memory.
// Khi gọi modifyPrimitiveTypes (), hai bản sao được tạo ra bên trong bộ nhớ ngăn xếp (giả sử w và z)
// và sau đó chúng được truyền đến medthod. Do đó, các biến ban đầu không được gửi đến method và
// bất kỳ sửa đổi nào trong luồng xử lý của method chỉ ảnh hưởng đến các bản sao.
