package com.tellyouiam.interfaces.multiple.inheritance;

/**
 * Java không cho phép đa kế thừa vì vấn đề (trong docs) Diamond problem (class) nhưng đối với interface thì java có hỗ trợ
 * cơ chế xử lý vấn đề này
 * Reference: http://codeinventions.blogspot.com/2014/07/can-interface-extend-multiple.html
 **/
public interface InterfaceA {
    void testMethod();
    void A();
}
