package DuiXiang_practice.Rectangle;

public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle.Zhouchang());
        System.out.println(rectangle.Mianji());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println(rectangle1.Zhouchang());
        System.out.println(rectangle1.Mianji());

        Rectangle rectangle2 = new Rectangle(4,3);
        System.out.println(rectangle2.Zhouchang());
        System.out.println(rectangle2.Mianji());

    }
}
