package b2512.liwenjian;

import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner Prime=new Scanner(System.in);
        System.out.println("请输入两个素数");
        System.out.print("第一个素数：");
        int out=Prime.nextInt();
        System.out.print("第二个素数：");
        int two=Prime.nextInt();
        int x=0; //保存素数
        Vector gather = new Vector();//集合,用来装所有的素数
        for(int i=out;i<=two;i++)
        {
            boolean b=true;//标签为b为真
            for(int j=2;j<i;j++)
            {
                if(i%j==0)//求余数是否为0
                {
                    b = false;//如果为0, 将标签设置为false
                    break;  //可以整除就跳出这个循环
                }
            }
            if(b==true)//如果为true
            {
                gather.add(i);//将符合要求的i加到集合里
                x++; // 素数个数加1
            }
        }
        System.out.println(out+"到中间"+two+"有:");
        System.out.println(x+" 个素数");
        System.out.println("素数为:"+gather);
    }
}
