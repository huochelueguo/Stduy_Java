package Fangfa;

public class DaiMaKuai {
    public static void main(String[] args) {
        DaiMaKuai d = new DaiMaKuai(10,10);
        DaiMaKuai d2 = new DaiMaKuai("房贷收紧开发商");//调用构造函数   【代码块】

    }
    static {
        int a =10;
        System.out.println(a);          //静态代码块，只被执行一次，并且最先执行【静态块】
    }
     DaiMaKuai(int a ,int b){
        int c ;
        c=a*b;
        System.out.println(c);          //构造函数中的代码成为构造块【构造块】
    }
     DaiMaKuai(String a){         //构造函数的重载
        int b ;
        b = a.length();
        System.out.println(b);
    }

}
