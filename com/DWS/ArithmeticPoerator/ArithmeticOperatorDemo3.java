package com.DWS.ArithmeticPoerator;

public class ArithmeticOperatorDemo3 {
    public static void main(String[] args)
    {
        //隐式类型转化
        //范围小的与范围大的计算 自动转化为范围大的 再进行计算
        //byte short char  计算时自动转化为 int
        byte a=10;
        byte b=20;
        int  c=a+b;
        System.out.println(c);

        //强制类型转化
        //将范围大的强制转化为范围小的
        //数据类型 变量名 =（要转化的数据类型） 变量名

        //(byte)a+b 转化的是a
        //(byte) （a+b）转化的才是a+b的值
        byte d=10;
        byte e=20;
        byte f=(byte) (a+b);
        System.out.println(f);
    }
}
