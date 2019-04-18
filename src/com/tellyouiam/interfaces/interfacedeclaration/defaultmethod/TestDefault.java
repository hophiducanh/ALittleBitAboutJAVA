package com.tellyouiam.interfaces.interfacedeclaration.defaultmethod;

/**
 * As of Java 8, interfaces can include inheritable* methods with concrete implementations. (*The strict
 * definition of “inheritance” has gotten a little fuzzy with Java 8; we’ll talk more about inheritance in
 * Chapter 2.) These concrete methods are called default methods. In the next chapter we’ll talk a lot about
 * the various OO-related rules that are impacted because of default methods. For now we’ll just cover the
 * simple declaration rules:
 * default methods are declared by using the default keyword. The default keyword can be
 * used only with interface method signatures, not class method signatures.
 * default methods are public by definition, and the public modifier is optional.
 * default methods cannot be marked as private, protected, static, final, or abstract.
 * default methods must have a concrete method body.
 * */
public interface TestDefault {
    //default only use with TestDefault
    public default int m1() {
        return 1;
    }

    public default void m2() {
        ;
    }
}
