/*输出任意一个三位数中的个位数字和百位数字对调的数值，例如如果三位数是235，则输出532.*/
package TESTIF;

import java.util.Scanner;

public class TESTIF08 {

    public static void main(String[] args) {
        System.out.printf("输入");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        if (i>=100 && i <1000){
            int a = (i%10);
            int b = (i/10)%10;
            int c = (i/100);
            int d= a;
            int e =c;
            System.out.println(d);
            System.out.println(e);
            System.out.println(b);
            System.out.print("转换后:"+d+b+e);

        }
        else
            System.out.printf("输入错误");
    }
}
