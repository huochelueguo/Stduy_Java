package Fangfa;

public class FangfaDidoyong01 {
    public static void main(String[] args) {
        System.out.println(a(10,20));//a方法有返回值带参，可以直接调用
        FangfaDidoyong01 f1 = new FangfaDidoyong01();
        f1.b(10,20);                //b方法没有返回值带参，必须NEW对象来调用
        f1.b(10.1,10.1);
        c();
        FangfaDidoyong01 f2= new FangfaDidoyong01();
        f2.d();
        e();
    }
    public static int a (int a,int b){
        int c ;
        c=a+b;
        return c;
    }
    public void  b (int a ,int b){
        int c;
        c=a*b;
        System.out.println(c);
    }
    public void b(double a,double b){       //方法重载，同一个类中，名称一样，形参不一致，和修饰词无关
        double c;
        c=a*b;
        System.out.println(c);
    }
    public  static    int c (){
       int a= a(5,10);              //同一个类中，静态方法互相调用，a为静态方法，可以直接调用
        System.out.println(a);
        return a;
    }
    public void  d(){                   //同一个类中，方法互相调用，B为非静态方法，d也是非静态方法，因此可以直接调用
        b(15.5,15.5);

    }
    public  static double  e(){             //同一个类中，静态方法调用非静态方法，需要NEW对象在调用
        FangfaDidoyong01 f3= new FangfaDidoyong01();
        f3.b(3.3,3.3);
        return  1;
    }

}
