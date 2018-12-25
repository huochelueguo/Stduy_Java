package FatherSon;

public class Father extends Object{
    int age;
    double high;
    String name;

    public  Father(){
        int a = 100;
        System.out.println(a);
    }
    public  Father(int age,double high){            //构造方法的重载，形参不一致
        System.out.println(age+high);
    }
    public void a(){
        System.out.println(age);
    }
    public  void b(){
        System.out.println(high);
    }
    public  void c(){
        System.out.println(name);
    }
}
