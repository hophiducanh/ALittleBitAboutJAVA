package com.tellyouiam.object.memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

public class ObjectLocation {
	private static final int apple = 10;
	private final static int orange = 10;
	private final static int[] arr = new int[]{1,2,3};
	static String name = "Logbasex";
	static String name1 = "Logbasex";
	private static char ch = 'a';
	private static String str = "a";
	
	static long toAddress(Object obj) throws NoSuchFieldException, IllegalAccessException {
		Object[] array = new Object[] {obj};
		long baseOffset = getUnsafeInstance().arrayBaseOffset(Object[].class);
		return Integer.toUnsignedLong(getUnsafeInstance().getInt(array, baseOffset));
	}
	
	static Object fromAddress(long address) throws NoSuchFieldException, IllegalAccessException {
		Object[] array = new Object[] {null};
		long baseOffset = getUnsafeInstance().arrayBaseOffset(Object[].class);
		getUnsafeInstance().putLong(array, baseOffset, address);
		return array[0];
	}
	
	public static void main(String[] args) throws Exception {
		Unsafe unsafe = getUnsafeInstance();
		
		Field appleField = ObjectLocation.class.getDeclaredField("apple");
		System.out.println("Location of Apple: "
				+ unsafe.staticFieldOffset(appleField));
		
		Field orangeField = ObjectLocation.class.getDeclaredField("orange");
//		System.out.println("Location of Orange: "
//				+ unsafe.objectFieldOffset(orangeField));
//		System.out.println(toAddress(arr));
//		System.out.println(fromAddress(toAddress(arr)));
//		System.out.println(sizeOf(arr));
//		System.out.println(sizeOf(apple));
//		System.out.println(sizeOf(new ObjectLocation()));
		System.out.println("Size of char: " + sizeOf(ch));
		System.out.println("Size of string: " + sizeOf(str));
		System.out.println("Size of int: " + sizeOf(orange));
		
		//https://stackoverflow.com/questions/16859969/string-s1-string-s2-true-but-fieldoffset-is-different
		//String s1 == String s2 (true) but FieldOffset is different
		Field nameField = ObjectLocation.class.getDeclaredField("name");
		Field name1Field = ObjectLocation.class.getDeclaredField("name1");
		System.out.println(unsafe.staticFieldOffset(nameField));
		System.out.println(unsafe.staticFieldOffset(name1Field));
		System.out.println(name == name1);
		
	}
	
	public static long sizeOf(Object o) throws NoSuchFieldException, IllegalAccessException {
		Unsafe u = getUnsafeInstance();
		HashSet<Field> fields = new HashSet<Field>();
		Class c = o.getClass();
		while (c != Object.class) {
			for (Field f : c.getDeclaredFields()) {
				if ((f.getModifiers() & Modifier.STATIC) == 0) {
					fields.add(f);
				}
			}
			c = c.getSuperclass();
		}
		
		// get offset
		long maxSize = 0;
		for (Field f : fields) {
			long offset = u.objectFieldOffset(f);
			if (offset > maxSize) {
				maxSize = offset;
			}
		}
		
		return ((maxSize/8) + 1) * 8;   // padding
	}
	
	
	private static Unsafe getUnsafeInstance() throws SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException {
		Field theUnsafeInstance = Unsafe.class.getDeclaredField("theUnsafe");
		theUnsafeInstance.setAccessible(true);
		return (Unsafe) theUnsafeInstance.get(Unsafe.class);
	}
}
