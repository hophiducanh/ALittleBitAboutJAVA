package com.tellyouiam.variable.declaration.kindofvariable.localvariable;

public class ThisKeyword {
     private int size = 27;

    /** Line 11:
     *  this.size means the current object's instance variable, size. The size on the right is the parameter
     * */

    public void setSize(int size) {
        this.size = size;
        //size = size; ??? which size equals which size
    }

}
