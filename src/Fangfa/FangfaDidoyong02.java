package Fangfa;


public class FangfaDidoyong02 {
    public static void main(String[] args) {
        int a = FangfaDidoyong01.a(100,100);
        System.out.println(a);         //不同类之间，静态方法可以直接用类名.方法调用
        FangfaDidoyong01 f1 = new FangfaDidoyong01();
        f1.d();                         //不同类质检，非静态方法只能通过NEW对象来调用
        a();

    }

    public static  int a (){
        FangfaDidoyong01.e();       //  调用其他类的静态方法，可以直接类名.方法调用
        return 1;
    }
}
