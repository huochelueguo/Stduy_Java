import java.util.Random;

public class Math {
    public static void main(String[] args) {
        int a = (int)(java.lang.Math.random()*+100);
        System.out.println(a);

        Random r1 = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(r1.nextInt(10));
            System.out.println(r1.nextBoolean());
            System.out.println(r1.nextDouble());
        }
    }
}
