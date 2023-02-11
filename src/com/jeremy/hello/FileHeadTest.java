package com.jeremy.hello;

/**
 * User: ningshunbin
 * Date: 2019/6/3
 * Time: 13:59
 * Description: 断点调试
 */
public class FileHeadTest {
    public static void main(String[] args)
    {
        System.out.println("Hello!");
        int tmp1 = 50;
        int tmp2 = 100;
        int tmp3 = addNum(tmp1, tmp2);
        System.out.print(tmp3);
    }

    public static int addNum(int tmp1, int tmp2)
    {
        int tmp3 = tmp1 + tmp2;
        return tmp3;
    }
}

