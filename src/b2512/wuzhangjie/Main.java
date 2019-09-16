package b2512.wuzhangjie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int a = scan.nextInt();
        System.out.print("请输入第二个数:");
        int b = scan.nextInt();
        int num1=0;
        int pic=0;
        if(a>=b){
            pic = b;
            b = a;
            a = pic;
        }
        for (int i = a;i<=b;i++){
            boolean flag = true;
            for(int j =2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.print(i+"\t");
                num1++;
            }
        }
        System.out.println("\n"+a+"和"+b+"的两个数之间有"+num1+"个素数");
    }
}
