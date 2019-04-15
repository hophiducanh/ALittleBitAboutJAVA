package com.tellyouiam.variable.declaration.referencevaribale.localvariable;

public class TestVariable {
    public void logIn() {
        //local variable
        int count = 10;//Biến này được lưu trữ trong bộ nhớ stack sẽ bị Garbage Collection xóa đi sau khi hàm kết thúc
    }
    public void doSomething (int i) {
        //count = i; //Không thể gọi count bên ngoài phạm vi hàm logIn(){}
    }
}
