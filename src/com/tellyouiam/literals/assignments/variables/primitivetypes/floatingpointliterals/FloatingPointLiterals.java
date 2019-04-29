package com.tellyouiam.literals.assignments.variables.primitivetypes.floatingpointliterals;

public class FloatingPointLiterals {
    public static void main(String[] args) {

        //Floating-point numbers are defined as a number, a decimal symbol, and more numbers representing the
        //fraction. In the following example, the number 11301874.9881024 is the literal value:
        //double d = 11301874.9881024;

        double d = 11301874.9881024;

        //Floating-point literals are defined as double (64 bits) by default, so if you want to assign a floatingpoint literal
        //to a variable of type float (32 bits), you must attach the suffix F or f to the number. If you
        //don’t do this, the compiler will complain about a possible loss of precision, because you’re trying to fit a
        //number into a (potentially) less precise “container.”


        //float f = 23.467890; //Compiler error; possible loss of precision
        //(Bởi vì float chỉ lưu trữ 7 bit, tương đương với độ chính xác 7 chữ số thập phân do trừ đi một sign bit -
        // bit dấu, double độ chính xác 15 chữ số thập phân mà floating-point mặc định là double)

        float g = 498837849.029847F; //Ok; has the suffix "F"

        //You may also optionally attach a D or d to double literals, but it is not necessary because this is the
        //default behavior

        double d1 = 11301874.9881024D; //optional not required
        double d2 = 987.789; //No 'D' suffix but Ok because the literal is a double by default

    }
}
