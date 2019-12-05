package com.tellyouiam.string.stringinjava;

public class StringBuffer_ConcatenateString {

    StringBuffer stringBuffer_1 = new StringBuffer();
    //Tạo một đối tượng StringBuffer rỗng khả năng chứa ban đầu 16 kí tự

    StringBuffer getStringBuffer_2 = new StringBuffer(50);
    //Tạo một đối tượng StringBuffer rỗng khả năng chứa ban đầu do bạn định nghĩa trong trường hợp này là 50.

    StringBuffer getStringBuffer_3 = new StringBuffer("Hello World!");

    //Và vì StringBuffer và StringBuilder là các cấu trúc giúp thay đổi chuỗi thoải mái,
    // nên cứ yên tâm là sẽ không ảnh hưởng đến hiệu suất của hệ thống nếu bạn thay đổi nhiều
    // và liên tục trên chuỗi. Nó không giống final class String mỗi khi reassign thì thực sự tạo ra một đối
    //tượng mới trong bộ nhớ, đối tượng cũ vẫn giữ nguyên. Làm giảm hiệu suất hệ thống. Đây là khái niệm
    //mutable và immutable trong java

    //CONCATENATE IN JAVA
    public static void main(String[] args) { //(1)
        StringBuffer str1 = new StringBuffer("Hello DucAnh!");
        str1.append("Hello my bitch!");
    }

    StringBuffer str3 = new StringBuffer("Hello World!");
    //Java don't allow any executable method here because out of main method is declarative area.
    //If you want to call method like
    //str2.append(" Hello Yellow Code Books!");
    // you can do it like this or write in main method like (1).

    {
        StringBuffer str2 = new StringBuffer("Hello World!");
        str2.append(" Hello Yellow Code Books!");
    }
    //instance initialization block
    {
        str3.append("Haha");
        //str2.append  //Bug do str2 được khai báo trong CodeBlocks, chỉ có hiệu lực trong phạm vi block
    }


}
