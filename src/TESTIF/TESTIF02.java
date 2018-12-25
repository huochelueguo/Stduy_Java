package TESTIF;

public class TESTIF02 {
    public static void main(String[] args) {
        int b=0;
        int count=0;
        for (int a = 1; a <100 ; a++) {
            if(b==a%6)
            {System.out.print(a+"\t");//被6整除的输出
            count++;
            if(count%4==0)
            {System.out.printf("\n");}//每四个换行
            }
        }
    }
}
