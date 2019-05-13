package com.tellyouiam.arraydeclaration.objectarray;

public class Main {
    public static void main(String[] args) {
        //But this is only creating pointers (references) to Test and not 4 objects.
        //Is this correct? I see that when I try to access functions/variables in the objects created I get a null pointer exception

        Test[] tests = new Test[4];

        //tests.someMethod();

        //creates 4 Test references, similar to doing this:
        //Test test1;
        //Test test2;
        //Test test3;
        //Test test4;

        //now you couldn't do test1.someMethod() without allocating test1 as
        //
        //test1 = new Test();
        //similarly, with the array you need to do
        //
        //tests[0] = new Test();
        //before using it.

        tests[0] = new Test();
        tests[0].someMethod();
    }
}
