package com.tellyouiam.accessmodifiers.threewayaccess.cert;

public class Roo {
    //Nếu dooRooThings là private method thì mặc dù Roo là public class thì class Cloo kế thừa cũng không truy cập được
    //doRooThings method
    public String doRooThings() {
        //imagine some fun code goes here
        return "fun";
    }
}
