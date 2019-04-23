package com.tellyouiam.isa.and.hasa.relationship.hasa;
/**
 * HAS-A relationships allow you to design classes that follow good OO practices by not having
 * monolithic classes that do a gazillion different things. Classes (and their resulting objects) should be
 * specialists
 * */
public class Horse {
    //halter is user of Horse class. Horse user don't have to know Halter class
    private Halter halter = new Halter();

    public void tie(LeadRope rope) {
        //Phương thức tie có thể tự xây dựng hoặc gọi từ một bên khác. Nếu gọi từ một bên khác thì có thể
        // ở một nơi nào khác trong application có thể bị duplicate code
        halter.tie(rope); //delegate tie behavior to the Halter Object
    }
}
