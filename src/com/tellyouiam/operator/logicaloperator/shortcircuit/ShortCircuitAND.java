package com.tellyouiam.operator.logicaloperator.shortcircuit;

/**
 * For an AND (&&) expression to be true, both operands
 * must be true
 * */

/**
 * AND (&&): trả về true khi cả 2 toán hạng đều trả về true, trả về false khi một trong 2 hoặc cả 2 toán hạng trả về false.
 * OR (||): trả về trả về true khi một trong 2 hoặc cả 2 toán hạng trả về true, và trả về false khi cả 2 toán hạng đều trả về false.
 * */

public class ShortCircuitAND {
    public static void main(String[] args) {
        //The short-circuit feature of the && operator is so named because it doesn’t waste its time on
        //pointless evaluations. A short-circuit && evaluates the left side of the operation first (operand one), and if
        //it resolves to false, the && operator doesn’t bother looking at the right side of the expression (operand
        //two) since the && operator already knows that the complete expression can’t possibly be true

        boolean b1 = false, b2 = false;
        //Do Short-circuit AND (&&) trả về true khi cả 2 toán hạng trả về true nên chỉ cần toán hạng đầu tiên trả
        //về false thì && operator không cần quan tâm toán hang thứ 2 nữa.

        boolean b3 = (b1 == true) && (b2 = true); //Will b2 be set to true
        System.out.println(b3 + " " + b2);
    }
}
