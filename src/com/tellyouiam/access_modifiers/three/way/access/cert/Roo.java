package com.tellyouiam.access_modifiers.three.way.access.cert;

public class Roo {
    //Nếu dooRooThings là private method thì mặc dù Roo là public class thì class Cloo kế thừa cũng không truy cập được
    //doRooThings method
    public String doRooThings() {
        //imagine some fun code goes here
        return "fun";
    }
}
