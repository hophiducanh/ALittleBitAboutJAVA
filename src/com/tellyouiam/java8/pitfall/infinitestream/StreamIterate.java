package com.tellyouiam.java8.pitfall.infinitestream;

import java.util.stream.IntStream;

public class StreamIterate {
	public static void main(String[] args) {
		/**
		 * Chúng ta tạo ra stream với các giá trị 0 và 1 xen kẽ (iterate(0, i -> ( i + 1 ) % 2))
		 * Sau đó chúng ta chỉ giữ lại một giá trị trùng, ví dụ 0 và 1
		 * Sau đó chúng ta giới hạn lại kích thứơc của stream là 10
		 * Sau đó chúng ta sử dụng nó
		 * */
		IntStream.iterate(0, i -> (i+1) %2).distinct().limit(10).forEach(System.out::println);
		
		// À ha, hàm distinct() không hề biết hàm cung cấp cho iterate() chỉ tạo ra hai giá trị.
		// Nó có thể mong đợi nhiều hơn thế.
		// Vì vậy, nó sẽ mãi mãi sử dụng những giá trị mới từ stream, và hàm limit(10) sẽ không bao giờ được gọi.
	}
}
