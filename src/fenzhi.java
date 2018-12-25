public class fenzhi {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        if (a>b){
          if(a>c){
              System.out.println("最大值是a="+a);
          }
          else
              System.out.println("最大值是c="+c);
        }
        else  if (b>c)
            System.out.println("最大值是b="+b);
        else
            System.out.println("最大值是c="+c);

    }
}
