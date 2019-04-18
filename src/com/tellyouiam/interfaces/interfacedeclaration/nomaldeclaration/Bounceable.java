package com.tellyouiam.interfaces.interfacedeclaration.nomaldeclaration;


/**
 * In Java, Classes implement Interfaces. Interfaces are contracts. In other words, interfaces specify the APIs
 * (Application Programming Interfaces) that will be used by other applications/modules.
 * Interfaces make 'abstraction', one of the key object oriented principles possible.
 * Hence all the methods in interfaces are abstract without concrete definitions.
 * So some concrete 'Class' has to 'implement' an interface and provide definitions for the APIs.
 * When a class 'implements' an interface it defines the APIs declared by the interface.
 * */

//interfaces are implicitly abstract whetheryou type abstract or not
public abstract interface Bounceable {

    //private final static -> create this variable only once. private final -> create this variable for every object.
    // First one saves memory, go for it.
    //Nếu không dùng static thì có thể rơi vào trường hợp blank final (Có thể thay đổi giá trị biến)
    public static final int BAR = 42;

    //Typing in the public and abstract modifiers on the methods is redundant, though, since all interface
    //methods are implicitly public and abstract

    public abstract void bounce();

    public abstract void setBounceFactor();

    //    The following is identical
    //    void bounce();
    //    void setBounceFactor();
    //    public void bounce();
    //    abstract void bounce();
    //    abstract public void bounce();

    //  The following interface method declarations won’t compile:
    //    final void bounce();
    //    private void bounce();
    //    protected void bounce();
}
