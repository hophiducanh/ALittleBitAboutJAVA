package com.tellyouiam.literals.assignments.variables.primitivetypes.booleanliterals;

/**
 * @author : Ho Anh
 * @since : 25/10/2019, Fri
 **/
public class BooleanInIfStatement {
    public static void main(String[] args) {
        Request request = new Request();
        boolean isValid = request.isValid();
        if (!isValid) {
            System.out.println("Hello");
        }
    }
}

class Request {
    private boolean isValid = false;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}