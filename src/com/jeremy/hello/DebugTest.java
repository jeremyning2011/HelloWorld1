package com.jeremy.hello;

import java.util.HashMap;

/**
 * @author ningshunbin
 * @date 2023-02-11 - 13:42
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("name","Tom");
        testMap.put("age","22");
        testMap.put("school","Tsinghua");
        testMap.put("major","computer");

        String age = testMap.get("age");
        System.out.println("age = " + age);

        testMap.remove("major");
        System.out.println(testMap);
    }
}
