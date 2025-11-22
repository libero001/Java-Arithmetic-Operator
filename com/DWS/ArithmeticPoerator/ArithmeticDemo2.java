package com.DWS.ArithmeticPoerator;

public class ArithmeticDemo2 {
    public static void main(String[] args)
    {
        //除法

        //1.整数参与运算，结果只能得到整数
        //2.小数参与计算，结果可能是不精确的，如果我们需要精确去计算，需要运用别的知识
        System.out.println(10/2);
        System.out.println(10/3);//整数除法只能得到整数
        System.out.println(10/3.0);

        //取模% 做除法运算，得到余数

        System.out.println(10%3);//1

          //应用场景
           //1.可以用取模来判断，A是否可以被B整除
           //2.可以判断A是否为偶数 A%2==0
           //3.斗地主发牌， 把每一个牌都定义一个序号，序号%3，发牌给玩家
    }
}
