package FengZhuang_practice;

public class Animal {
    private int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String myself(){             //【封装成一个方法，在子类中重写】
        return  "我是XXX，子类重写";
    }
}
