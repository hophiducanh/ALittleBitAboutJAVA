package com.tellyouiam.operator.equalityoperator.primitive;
/**
 * So what does == look at? The value in the variable—in other words, the bit pattern.
 * */
public class ComparePrimitives {
    public static void main(String[] args) {
        System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
        System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
        System.out.println("5 != 6? " + (5 != 6));
        System.out.println("5.0 == 5L? " + (5.0 == 5L));
        System.out.println("true == false? " + (true == false));

        //Don’t mistake = for == in a boolean expression. The following is legal:
        boolean b = false;
        if (b = true) {          //line 15
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
        //Look carefully! You might be tempted to think the output is b is false, but look at the
        //boolean test in line 15. The boolean variable b is not being compared to true; it’s being set to
        //true. Once b is set to true, the println executes and we get b is true. The result of any
        //assignment expression is the value of the variable following the assignment. This substitution
        //of = for == works only with boolean variables because the if test can be done only on boolean
        //expressions. Thus, this does not compile:

          int x = 1; //if expression always return boolean value -> if(x = 0) is wrong
        //if (x = 0) {}

        //Because x is an integer (and not a boolean), the result of (x = 0) is 0 (the result of the
        //assignment). Primitive ints cannot be used where a boolean value is expected, so the code in
        //line 8 won’t work unless it’s changed from an assignment (=) to an equality test (==) as
        //follows:

        if (x == 0) {}
        
        Integer xval = 1;
        if (xval.equals(null)) {
            System.out.println("Haha");
        }
        int y = 1;
        if (xval == y) {
            System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCC");
        }
    }
}
