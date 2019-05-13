package com.tellyouiam.operator.equalityoperator.equal.hashcode.method;
/**
 * Reference:
 * 1. https://www.geeksforgeeks.org/difference-equals-method-java/
 * 2. https://www.geeksforgeeks.org/equals-hashcode-methods-java/ass
 * 3. https://stackjava.com/java/hashcode-va-equals-trong-java.html
 * 4. https://huongdanjava.com/vi/phuong-thuc-equals-va-phuong-thuc-hashcode-trong-java.html
 * 5. https://viblo.asia/p/how-and-when-override-equals-and-hashcode-1Je5EYvy5nL
 * */

/**
 * Trong JAVA, có 2 kiểu biến: biến tham trị và tham chiếu.
 * Biến kiểu tham trị bao gồm các kiểu nguyên thủy của JAVA như: int, long, double…
 * Biến kiểu tham chiếu bao gồm: String, array, kiểu đối tượng…
 *
 * Khi sử dụng biến kiểu tham trị, JAVA chỉ cho phép bạn sử dụng toán tử so sánh “==”.
 * Khi sử dụng biến kiểu tham chiếu, JAVA cho phép sử dụng cả toán tử “==” và equals().
 * Tuy nhiên, khi sử dụng toán tử “==”, bộ xử lý của JAVA sẽ so sánh xem 2 biến tham chiếu này
 * có trỏ đến cùng một đối tượng hay không, còn nếu bạn sử dụng phương thức equals(),
 * bộ xử lý JAVA sẽ so sánh giá trị của 2 biến tham chiếu đó.
 * */
public class Geek {
    public String name;
    public int id;

    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //Checking if both the object references are refer to the same object.
        if (this == obj)
            return true;
            // it checks if the argument is of the
            // type Geek by comparing the classes
            // of the passed argument and this object.
            // if(!(obj instanceof Geek)) return false; ---> avoid.
            if(obj == null || obj.getClass()!= this.getClass())
                return false;

            // type casting of the argument.
            Geek geek = (Geek) obj;

            // comparing the state of argument with
            // the state of 'this' Object.
            return (geek.name == this.name && geek.id == this.id);
        }
    //Các đối tượng như HashMap, HashTable sử dụng các đối tượng key để tìm kiếm các đối tượng value tương ứng.
    // Và để tối ưu cho việc tìm kiếm, Java sử dụng các hash value lấy từ phương thức hashCode()
    // của các đối tượng key để gom nhóm các đối tượng này trong những cái gọi là các bucket.
    // Mỗi bucket tương ứng với một giá trị hash value.
    //
    //Khi tìm kiếm một đối tượng bất kỳ trong HashMap hay HashTable,
    // đầu tiên Java sẽ lấy hash value của đối tượng key mà chúng ta muốn tìm kiếm.
    // Sau đó nó sẽ kiểm tra các bucket để xem giá trị hash value đó có trùng khớp với bucket nào hay không.
    // Nếu thoả mãn một bucket nào đó thì Java sẽ trả về giá trị của đối tượng value mà chúng ta muốn tìm kiếm.
    //
    //Nhiều đối tượng có thể có cùng hash value, và do đó chúng có thể nằm chung một bucket.
    // Trong trường hợp này, Java sẽ sử dụng tiếp phương thức equals() để tìm chính xác đối tượng value
    // mà chúng ta muốn tìm kiếm.
    //
    //Ở đây chúng ta có một khái niệm gọi là contract giữa phương thức equals() và phương thức hashCode() đó là:
    //
    //Nếu hai đối tượng là bằng nhau thì chúng phải có cùng hashCode().
    //Nếu hai đối tượng có cùng hashCode() thì chúng có thể bằng nhau hoặc là không.

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.id;
    }
}
