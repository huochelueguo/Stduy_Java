package TESTIF;

public class TESTIF07 {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b <a+1 ; b++) {
                System.out.printf(a+"*"+b+"="+a*b+"\t");
            }
            System.out.println("\n");
        }
    }
}
