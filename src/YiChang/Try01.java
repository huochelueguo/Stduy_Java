package YiChang;

import java.util.Scanner;

public class Try01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("输入一个数字");
            int a = scanner.nextInt();
            System.out.println("在输入一个数字");
            int b = scanner.nextInt();
            System.out.println(a/b);
            return;
        }catch (Exception ex){
            System.out.println("程序出错");
            ex.printStackTrace();
            //throw ex;
        }finally {
            System.out.println("finally中代码块输出");
        }
             System.out.println("finally后代码");
        }
    }

