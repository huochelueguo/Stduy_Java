package FengZhuang_practice;

public class Bird extends Animal{
    private String color;

    public Bird() {
    }

    public Bird(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String myself(){
        return  "我是一只"+getColor()+"色的鸟，今年"+getAge()+"岁了";
    }
    public void tedian(){
        System.out.println("我展翅飞翔");
    }
}
