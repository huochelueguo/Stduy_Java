package YiChang;

import java.util.Scanner;

public class Try02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();//空格可以输出
        String s1 = scanner.next();//读取到有效字符后，就结束输入
        System.out.println(s);
        System.out.println(s1);


        if (scanner.hasNextInt()){
            int a  = scanner.nextInt();
            System.out.println(a);
        }else {
            System.out.println("false");
        }
    }
}
