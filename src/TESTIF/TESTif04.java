package TESTIF;

/*输出
    2	2
    4	4	4	4
    6	6	6	6	6	6
    8	8	8	8	8	8	8	8
    10	10	10	10	10	10	10	10	10	10
 */
public class TESTif04 {
    public static void main(String[] args) {
        int a =2;
        int c;

       // int d;
            for (int b = 1; b <6 ; b++) {
                c=a*b;
                for (int d = 1; d <2*b+1 ; d++) {
                    System.out.print(c+"\t");
                }System.out.println();

            }

    }


}
