package com.DWS.ArithmeticPoerator;

public class ArithmeticOperatorDemo4 {
    public static void main(String[] args)
    {
        // + 的操作数中含有字符串
        //会自动转化为字符串拼接，两个操作数拼接为一个新的字符串
        //如果有多个操作数从左向右依次相加

        System.out.println(12.3+"abc");//"12.3abc"
        System.out.println("abc"+true);//"abctrue"
        System.out.println(1+3+"abc");//"4abc"
        System.out.println("牛"+"abc"+true);//"牛abctrue"
        System.out.println(1+3+"abc"+1+3);//"4abc13"

        int a=10;
        System.out.println("abc"+a+"sj");//"abc10sj"   如果有变量，会用变量值拼接
        System.out.println("abc"+"a"+"sj");//"abcasj"
    }
}
