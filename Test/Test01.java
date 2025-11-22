package Test;

import java.util.Scanner;

public class Test01 {


        public static void main(String[] args)
        {
            //练习 利用取模拆分整数

            System.out.println("请输入一个整数");

            //导包 输入
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            //递归函数拆分
            numbericalSpit(n);

            //利用循环 ，取模拆分整数
            while(n>10)
            {
                System.out.println(n%10);
                n/=10;
            }
            System.out.println(n);
        }
    //利用递归拆分整数
    public static void numbericalSpit(int n) {
        if (n < 0)
            return;
        else if (n < 10)
            System.out.println(n);
        else {
            System.out.println(n % 10);
            numbericalSpit(n /= 10);
        }
    }
    }



