package TESTIF;

import java.util.Scanner;

public class TESTif {
    public static void main(String[] args) {
        //积分输入
        System.out.printf("请输入积分：");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        //输入数字进行判断
        if (a>=8000){
            System.out.printf("该会员享受的折扣是：0.6");
        }
        else if(a>=4000){
            System.out.printf("该会员享受的折扣是：0.7");
        }
        else if (a>=2000){
            System.out.printf("该会员享受的折扣是：0.8");
        }
        else if(a<2000&&a>0){
            System.out.printf("该会员享受的折扣是：0.9");
        }
        else
            System.out.printf("积分为0");
    }
}
