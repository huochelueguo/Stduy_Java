package FengZhuang_practice;

public class Fish extends Animal {
        private int tizhong;

    public int getTizhong() {
        return tizhong;
    }

    public void setTizhong(int tizhong) {
        this.tizhong = tizhong;
    }

    public Fish(int age, int tizhong) {
        super(age);
        this.tizhong = tizhong;
    }
    public void tedian(){
        System.out.println("我在水里吐泡泡");
    }
    public String myself(){                         //对父类自我介绍重写
        return  "我是一只"+getTizhong()+"斤的鱼，今年"+getAge()+"岁拉";
    }
}
