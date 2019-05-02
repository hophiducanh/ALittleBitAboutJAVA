package com.tellyouiam.operator.logicaloperator.shortcircuit;

/**
 * The || operator is similar to the && operator, except that it evaluates to true if EITHER of the
 * operands is true. If the first operand in an OR operation is true, the result will be true,
 * so the shortcircuit || doesn’t waste time looking at the right side of the equation. If the first operand is false,
 * however, the short-circuit || has to evaluate the second operand to see if the result of the OR operation
 * will be true or false
 * */

/**
 * AND (&&): trả về true khi cả 2 toán hạng đều trả về true, trả về false khi một trong 2 hoặc cả 2 toán hạng trả về false.
 * OR (||): trả về trả về true khi một trong 2 hoặc cả 2 toán hạng trả về true, và trả về false khi cả 2 toán hạng đều trả về false.
 * */

public class ShortCircuitOR {
    public static void main(String[] args) {
        if ((isItSmall(3)) || (isItSmall(7))) {
            System.out.println("Result is true");
        }
        if ((isItSmall(6)) || (isItSmall(9))) {
            System.out.println("Result is true");
        }
    }

    private static boolean isItSmall(int i) {
        if (i < 5) {
            System.out.println("i < 5");
            return true;
        } else {
            System.out.println("i >= 5");
            return false;
        }
    }
}
