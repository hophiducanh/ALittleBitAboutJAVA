package com.tellyouiam.covariant.returntype;

/**
 * @author : Ho Anh
 * @since : 18/02/2020, Tue
 **/

//Trước Java 5, bạn không thể ghi đè bất kỳ phương thức nào bằng cách thay đổi kiểu trả về.
// Còn từ Java 5 trở đi, bạn có thể ghi đè bằng cách thay đổi kiểu trả về nếu lớp con ghi đè bất kỳ phương thức nào mà kiểu trả về
// là Non-Primitive nhưng nó thay đổi kiểu trả về của nó thành kiểu lớp con. Hãy xem ví dụ đơn giản sau:
class B1 extends A {
//	A get() {
//		return new B1();
//	}
	B1 get() {
		return this; //if we don't have covariant return type: return B1 instead of A. We have to >> see below:
	}
	
	private void message() {
		System.out.println("Covariant Return type example");
	}
	
	public static void main(String[] args) {
		// ((B1) new B1().get()).message(); //we have to explicitly down casting.
		// When the first introduce when JDK 5 release >>
		// It helps to avoid confusing type casts present in the class hierarchy and thus making the code readable, usable and maintainable.
		new B1().get().message();
	}
	
	//Như bạn thấy trong ví dụ trên, kiểu trả về của phương thức get () của lớp A là A nhưng kiểu trả về của phương thức get () của lớp B1 là B1.
	// Cả hai phương thức đều có kiểu trả về khác nhau, nhưng nó là ghi đè phương thức. Đây được gọi là kiểu trả về hiệp biến.
	
	//Read further: https://stackoverflow.com/questions/1882584/what-is-a-covariant-return-type
}
