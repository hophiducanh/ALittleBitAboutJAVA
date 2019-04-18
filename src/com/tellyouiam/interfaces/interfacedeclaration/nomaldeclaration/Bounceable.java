package com.tellyouiam.interfaces.interfacedeclaration.nomaldeclaration;

//interfaces are implicitly abstract whether
//you type abstract or not
public abstract interface Bounceable {

    //private final static -> create this variable only once. private final ->create this variable for every object.
    // First one saves memory, go for it.
    //Do interface không thể khởi tạo đối tượng nên static là hợp lí
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

    //The following interface method declarations won’t compile:
    //    final void bounce();
    //    private void bounce();
    //    protected void bounce();
}
