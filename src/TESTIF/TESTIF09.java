package TESTIF;

import java.util.Scanner;

public class TESTIF09 {


    public static void main(String[] args) {
        System.out.printf("输入数字1");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();          //获取用户输入，并且设置变量读取具体值

        System.out.printf("输入数字2");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int c=1;
        for (int i = 1; i <= a; i++) {
            if ((a%i==0)&&(b%i==0)){
                c=i;
            }
        }
        System.out.print(c);
    }


}
