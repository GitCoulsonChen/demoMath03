package b2512.huangsai;

//判断两个数之间有多少个素数,并输出所有素数
//两个数要使用Scanner输入
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("请输入第一个数:");
        int first = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数:");
        int second = new Scanner(System.in).nextInt();
        int num = 0;

        int count;
        if(second<first) {
            count=second;
            second=first;
            first=count;
        }

        for (int i = first; i <= second; i++) {
            int k = (int) Math.ceil(i / 2);
            boolean flag = true;
            for(int j=2;j<=k;j++) {
                if(i%j==0) {
                    flag = false;
                }
            }
            if(flag){
                System.out.print(i+"  ");
                num++;
            }
        }
        System.out.println(" ");
        System.out.println(first+"和"+second+"之间共有"+num+"个素数");
    }
}
