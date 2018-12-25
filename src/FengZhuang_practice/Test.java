package FengZhuang_practice;

public class Test {
    public static void main(String[] args) {
        Fish f = new Fish(4,5);
        System.out.println(f.myself());
        f.tedian();
        System.out.println();

        Bird b = new Bird(3,"红色");
        System.out.println(b.myself());
        b.tedian();

    /**         1.年龄两个动物都有，因此可以写到父类中继承；【继承】
     *          2.输出我是XX，年龄XX，格式一致，并且都有年龄，因此可以 写到父类中一个方法来输出，在子类中重写该方法，来满足子类使用，减少代码【重写】【封装】
     *          3.个人特点在 子类中单独一个方法
     *
     *          【继承】【重写】【封装】
     *     *
     *     * */
    }



}
