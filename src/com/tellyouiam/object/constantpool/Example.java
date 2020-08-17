package com.tellyouiam.object.constantpool;

import com.tellyouiam.object.memory.ObjectLocation;
import sun.reflect.ConstantPool;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {
	private static final Method getConstantPool;
	
	static {
		try {
			getConstantPool = Class.class.getDeclaredMethod("getConstantPool");
			getConstantPool.setAccessible(true);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}
	void butts() throws InvocationTargetException, IllegalAccessException {
		ConstantPool constantPool = (ConstantPool) getConstantPool.invoke(ObjectLocation.class);
		System.out.println(constantPool.getClass());
	}
}
