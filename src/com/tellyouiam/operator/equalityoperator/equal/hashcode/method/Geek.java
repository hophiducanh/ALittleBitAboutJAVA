package com.tellyouiam.operator.equalityoperator.equal.hashcode.method;
/**
 * Reference:
 * 1. https://www.geeksforgeeks.org/difference-equals-method-java/
 * 2. https://www.geeksforgeeks.org/equals-hashcode-methods-java/ass
 * 3. https://stackjava.com/java/hashcode-va-equals-trong-java.html
 * 4. https://huongdanjava.com/vi/phuong-thuc-equals-va-phuong-thuc-hashcode-trong-java.html
 * 5. https://viblo.asia/p/how-and-when-override-equals-and-hashcode-1Je5EYvy5nL
 * */
public class Geek {
    public String name;
    public int id;

    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //Checking if both the object references are refer to the same object.
        if (this == obj)
            return true;
            // it checks if the argument is of the
            // type Geek by comparing the classes
            // of the passed argument and this object.
            // if(!(obj instanceof Geek)) return false; ---> avoid.
            if(obj == null || obj.getClass()!= this.getClass())
                return false;

            // type casting of the argument.
            Geek geek = (Geek) obj;

            // comparing the state of argument with
            // the state of 'this' Object.
            return (geek.name == this.name && geek.id == this.id);
        }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.id;
    }
}
