package TESTIF;

/*水仙花数指三位数中，每个数字的立方和和自身相等的数字，例如370，3 × 3 × 3 + 7 × 7 × 7 + 0 × 0 × 0 =370，请输出所有的水仙花数。*/
public class TESTIF06 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int a = i%10;
            int b =(i/10)%10;
            int c = i/100;
            /*拆分个位数字使用i和10取余即可，拆分十位数字时首先用i除以十，去掉个位数字，并使原来的十位数字变成个位，然后和10取余即可，因为i是一个三位数，所以i除以100即可得百位数字*/
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);}
        }
    }

}
