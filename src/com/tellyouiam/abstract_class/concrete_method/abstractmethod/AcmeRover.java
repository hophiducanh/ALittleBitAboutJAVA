package com.tellyouiam.abstract_class.concrete_method.abstractmethod;

/**
 * Abstract class must be implemented by a nonabstract subclass. If the subclass
 * is abstract, it is not required to implement the abstract methods, but it is
 * allowed to implement any or all of the superclass abstract methods. The
 * AcmeRover class is nonabstract, so it must implement the abstract method declared
 * in its superclass, SUV, and it must also implement turn(), which was not implement by SUV
 */
public class AcmeRover extends SUV {

    //3 phương thức trên chưa phải là concrete method (do kế thừa từ cây thừa kế bao gồm cả ông nội, ông cụ tổ -
    // trong trường hợp này là cha SUV và ông nội Car)
    //nên nếu ông nội và ông cụ tổ có phương thức chưa là concrete method thì đểu phải override lại thêm thân phương
    //thức cho nó.

    @Override
    void goOffRoad() {

    }

    @Override
    void goForward() {

    }

    @Override
    void turn(int a) {

    }

}
