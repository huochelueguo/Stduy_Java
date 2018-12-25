package DuiXiang_practice.Rectangle;

import java.util.Scanner;

public class Circle_Test {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径");
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        double banjing = scanner.nextDouble();
        if(banjing>0){
            System.out.println("圆的周长为："+circle.zhouchang(banjing));
            System.out.println("圆的面积为："+circle.mianji(banjing));
        }
        else
        {
            System.out.println("输入错误，请重新输入");
        }

        Ball ball = new Ball();
        System.out.println(ball.mianji(banjing));
        System.out.println(ball.tiji(banjing));
    }
}
