
public class suiji {
    public static void main(String[] args) {
            int a=(int)(Math.random()*6);
            int b=(int)(Math.random()*6);
            int c=(int)(Math.random()*6);
            System.out.print(a+"\n");
            System.out.print(b+"\n");
            System.out.print(c+"\n");
            int sum=a+b+c;
            System.out.print(sum+"\n");
            if (sum>4){
                if(sum>=15){
                    System.out.printf("三个数字之和大于等于15");
                }
                else if (sum>=10){
                    System.out.printf("三个数字之和大于等于10并且小于15");
                }
                else if (sum>=4){
                    System.out.printf("三个数字之后大于等于4并且小于10");
                }
            }
            else {
                System.out.printf("三个数字之和在3和4之间");
            }


}}
