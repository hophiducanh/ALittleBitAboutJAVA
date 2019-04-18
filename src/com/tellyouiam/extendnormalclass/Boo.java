package com.tellyouiam.extendnormalclass;

//Couldn't extends more Coo class
//Java không hỗ trợ đa kế thừa cho class(abstract class) (Nếu trong Foo và Coo đều có chung A() method thì Boo biết kế thừa method
// nào. Nhưng một điều khá mâu thuẫn là một class có thể extend nhiều interface, chúng ta sẽ bàn đến việc này sau. )

public class Boo extends Foo {

    //Chỉ bắt buộc phải override khi kế thừa abstract class, còn nếu không kế thừa abstract class thì điều đó không
    //thực sự cần thiết
    void A() {
        System.out.println(a);
    }

}
