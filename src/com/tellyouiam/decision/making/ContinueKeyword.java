package com.tellyouiam.decision.making;

public class ContinueKeyword {
    public static void main(String[] args) {
        //continue terminates the rest of the processing of the code within the loop for the current iteration, BUT continues the loop.
        for(int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
