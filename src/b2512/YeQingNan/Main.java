package b2512.YeQingNan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int one = sc.nextInt();
        System.out.print("输入第二个数：");
        int two = sc.nextInt();
        int a;
        int num = 0;
        if (one > two) {
            a = two;
            two = one;
            one = a;
        }
        for (int i = one; i <= two; i++) {
            int k = (int)Math.ceil(i/2);
            boolean flag = true;

            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i+"  ");
                num++;
            }
        }
        System.out.println(" ");
        System.out.println(one + "和" + two + "之间共有" + num + "个素数");
    }
}
