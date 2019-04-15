package com.tellyouiam.variable.declaration.referencevaribale.instancevariable;

/**
 * Instance variables are defined inside the class, but outside of any method, and are initialized only when
 * the class is instantiated. Instance variables are the fields that belong to each unique object.
 * Biến instance không thể đi cùng `static` vì đó là biến của lớp
 */
public class Employee {
    //instance variable for Employee instances
    private int a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String title;
    private String manager;


    public static void main(String[] args) {
        //local variable
        String surname;

        Employee employee = new Employee();
        System.out.println(employee.name); //default value of instance variable name = null;

        //Do instance variable chỉ được khởi tạo khi class được khởi tạo nên được load vào trong bộ nhớ HEAP
        //(là bộ nhớ chứa đối tượng, biến toàn cục hỗ trợ truy cập khắp mọi nơi trong class, những biến và
        // đối tượng này chỉ bị Garbage Collection xóa đi khi không còn tham chiếu từ bộ nhớ Stack)
        // nên cần có giá trị khởi tạo ban đầu... (Cũng không chắc, có thể thực ra là do James Gosling thích thôi)
/**
 *Local variables are declared mostly to do some calculation.
 *So its the programmer's decision to set the value of the variable and it should not take a default value.
 *If the programmer, by mistake, did not initialize a local variable and it take default value,
 *then the output could be some unexpected value. So in case of local variables,
 *the compiler will ask the programmer to initialize with some value before they
 *access the variable to avoid the usage of undefined values.
 * */

        System.out.println(employee.a); //default value of instance variable a = 0;
        //System.out.println(surname); //bug: might not have been initialized.
    }

}

/**
 * Một chút về bộ nhớ HEAP và STACK của java là thông thường thì biến local sẽ lưu ở Stack còn instance variable
 * hay Object sẽ được lưu ở bộ nhớ HEAP nhưng :  Now the "Java Hotspot Server Compiler" performs "escape analysis" and
 * decides to allocate some variables on the stack instead of the heap.
 * Có thể vì bộ nhớ Stack nhẹ và truy xuất nhanh giống như Cache trong kiến trúc máy tính
 */

/**
 * ESCAPE ANALYSIS
 *
 * INLINE FUNCTION (Hàm nội tuyến là gì?)
 * Khi được nạp vào ram, mỗi hàm sẽ có địa chỉ nhất định, khi gọi thì cpu sẽ jump tới địa chỉ đó.
 * Viết inline thì compiler sẽ chèn luôn code của hàm đó vào,
 * thay vì chèn địa chỉ, cpu chỉ chạy một mạch mà thôi, vậy nên sẽ nhanh hơn
* */
