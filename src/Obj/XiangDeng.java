package Obj;

public class XiangDeng {
    public static void main(String[] args) {
            int a =10;
            int b= 10;
        System.out.println(a == b);
        XiangDeng x = new XiangDeng(10);
        XiangDeng x2 = new XiangDeng(10);
        System.out.println(x.equals(x2));

    }
    public  XiangDeng(int a){
        int  x = a+10;
        System.out.println(x);
    }
}