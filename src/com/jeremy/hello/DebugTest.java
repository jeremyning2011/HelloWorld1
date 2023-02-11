package com.jeremy.hello;

import java.util.HashMap;

/**
 * @author ningshunbin
 * @date 2023-02-11 - 13:42
 */
public class DebugTest {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO 进行调试
        HashMap<String,String> testmap = new HashMap<>();
        testmap.put("name","Tom");
        testmap.put("age","22");
        testmap.put("school","Tsinghua");
        testmap.put("major","computer");

        if (testmap.get("age") != null) {
            String age = testmap.get("age");
            System.out.println("age = " + age);
        } else {
            //nothing to do!
        }


        testmap.remove("major");
        System.out.println(testmap);
    }
}
