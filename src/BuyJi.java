public class BuyJi {
    public static void main(String[] args) {
        for (int GJ = 0; GJ <=20 ; GJ++) {
            for (int MJ = 0;MJ<=33;MJ++){
                for (int XJ=0;XJ<=100-GJ-MJ;XJ++){
                    if(XJ%3 ==0 && 5*GJ+3*MJ+XJ/3 ==100&& GJ+MJ+XJ ==100 )   //判断条件，三个鸡合100；数量和100；XJ价格能被3整除
                    {System.out.print("公鸡："+GJ+"\t");
                    System.out.print("母鸡："+MJ+"\t");
                    System.out.println("小鸡："+XJ);}

                }
            }
            
        }
        
    }
}
//编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
//
//一钱三只，现有百钱欲买百鸡，共有多少种买法？