package com.tellyouiam.passbyreference.passbyvalue.passbycollection;

import java.util.ArrayList;
import java.util.List;

public class PassByCollection {
    public static void main(String[] args) {
        List<Integer> listNums = new ArrayList<Integer>();
        listNums.add(69);
        System.out.println("Size of list before List modification = " + listNums.size());
        modifyList(listNums);
        System.out.println("Size of list after List modification = " + listNums.size());
        //Chúng ta thấy rằng không giống như PassByWrapperClass ở đây bản sao trỏ đến địa chỉ mà bản gốc cũng
        //đang trỏ tới cho nên thay đổi giá trị bản sao cũng đồng thời thay đổi luôn giá trị bản gốc.
    }
    private static void modifyList(List<Integer> listParam)
    {
        listParam.add(96);
    }
    //Giải thích: Khi định nghĩa một ArrayList hay bất cứ collection nào trong Java,
    // một tham chiếu được tạo ra bên trong stack để trỏ tới nhiều đối tượng bên trong heap memory.
    // Khi gọi method modifyList(), một bản sao của đối tượng tham chiếu được tạo ra và truyền cho method.
    // Dữ liệu đối tượng thực được tham chiếu bởi hai đối tượng tham chiếu,
    // và bất kỳ thay đổi nào được thực hiện bởi một tham chiếu được phản ánh trong các tham chiếu còn lại.
    //
    //Bên trong method, khi chúng ta gọi là listParam.add (2),
    // là chúng ta đang cố gắng tạo một đối tượng Integer mới trong heap memory
    // và liên kết nó với danh sách các đối tượng hiện có.
    // Vì vậy, tham chiếu của list ban đầu có thể được sửa đổi,
    // vì cả hai tham chiếu đang trỏ đến cùng một đối tượng trong bộ nhớ.
}
