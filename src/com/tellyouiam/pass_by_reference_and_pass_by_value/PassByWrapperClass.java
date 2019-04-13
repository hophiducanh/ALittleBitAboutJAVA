package com.tellyouiam.pass_by_reference_and_pass_by_value;

public class PassByWrapperClass {

    public static void main(String[] args) {
        Integer obj1 = new Integer(69); //(1)
        //Integer là kiểu Object nên đầu tiên một biến obj1 có kiểu Integer
        // được lưu trong bộ nhớ STACK có giá trị null và
        // new Integer(69) tạo ra một ô nhớ có value = 69 trong bộ nhớ HEAP
        //và khi gán "=" thì tạo ra một tham chiếu đến Địa Chỉ của ô nhớ có giá trị là 69.
        Integer obj2 = new Integer(96); //(2)
        System.out.print("Values of obj1 & obj2 before wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
        modifyWrappers(obj1, obj2);
        System.out.print("Values of obj1 & obj2 after wrapper modification: ");
        System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());
        // Wrappers được lưu trữ bên trong heap memory với một tham chiếu bên trong stack memory.
        // Nên khi gọi hàm modifyWrappers (), một bản sao cho mỗi tham chiếu được tạo ra bên trong stack memory,
        // và các bản sao được truyền vào medthod.
        // Bất kỳ sự thay đổi nào đối với tham chiếu bên trong method thực sự thay đổi tham chiếu
        // của các bản sao chứ không phải các tham chiếu ban đầu.
    }
    private static void  modifyWrappers (Integer x, Integer y) {
        //Truyền vào bản sao của obj1 và obj2
        x = new Integer(11); //(3)
        //x này tham chiếu đến địa chỉ ô nhớ có giá trị 11 trên bộ nhớ HEAP nên không thay đổi được giá trị ban đầu
        //của obj1 mà chỉ thay đổi giá trị bản sao. Để thay đổi giá trị ban đầu thì x phải trỏ đến địa chỉ ô nhớ
        // mà obj1 cũng đang trỏ tới
        y =  new Integer(111); //(4)
    }
    //Qua trường hợp này và PassByPrimitive chúng ta có thể thấy rằng với kiểu sữ liệu nguyên thủy hay
    //với kiểu dữ liệu object java đều PASS_BY_VALUE (Thao tác trên bản sao) nhưng cũng có một số trường hợp
    //thao tác trên bản sao lại thay đổi giá trị của bản gốc.
    //Vậy điều đó thực sự xảy ra như thế nào?
    //Chúng ta thấy tại (1)(2)(3)(4) đã chứng tỏ khá nhiều. Hãy đi đến ví dụ tiếp theo
}
