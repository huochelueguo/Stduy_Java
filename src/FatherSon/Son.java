package FatherSon;

public class Son extends Father {
    int a ;
    double b;
    String name;
    String school;
    public  void  school(){
        System.out.println(school);
    }


    public  Son(){              //调用父类构造器时，父类必须有无参构造器，否则报错，子类不会继承父类有参构造器
        super(5,16.5);
        System.out.println("调用父类有参构造函数");
    }

    public void a (){          //继承父类a方法，并且重写
        System.out.println(a+10);
    }


}
