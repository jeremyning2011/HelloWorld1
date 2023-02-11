package com.jeremy.hello;

import java.util.ArrayList;

public class HelloWorld {


    public static void main(String[] args)
    {
        System.out.println("Hello World?");
        System.out.println("Hello!!");

        String[] arr = new String[]{"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        ArrayList<Integer> mylist = new ArrayList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);

        if (mylist == null) {
            System.out.println(mylist.get(1));
        }

        if (mylist != null) {
            System.out.println(mylist.get(0));
        }
    }
}


