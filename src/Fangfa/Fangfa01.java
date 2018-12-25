package Fangfa;
//根据输入数字输出乘法口诀
import java.util.Scanner;

public class Fangfa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fangfa01 ff =new Fangfa01();
        ff.chengfa(a);                   //如果方法没有static，那么就要new一个对象来调用，否则可以直接调用，如chengfa(a);

    }
    public   void chengfa(int n){
        int b=1;
        for (int i = 1; i <n+1 ; i++) {
            for (int m = 1; m <i+1 ; m++) {
                b = i*m;
                System.out.print(i+"x"+m+"="+b+"\t");

            }
            System.out.print("\n");
        }


    }
}
