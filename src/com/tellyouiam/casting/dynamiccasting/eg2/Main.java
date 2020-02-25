package com.tellyouiam.casting.dynamiccasting.eg2;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("var1", "test");
        map.put("var2", 1);

        Test t = new Test();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Field f = Test.class.getField(entry.getKey());

            f.set(t, f.getType().cast(entry.getValue()));
        }

        System.out.println(t.var1);
        System.out.println(t.var2);
    }
}
